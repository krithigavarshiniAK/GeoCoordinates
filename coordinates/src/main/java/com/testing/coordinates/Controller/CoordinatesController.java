
package com.testing.coordinates.Controller;

import com.testing.coordinates.Service.CoordinatesService;
import com.testing.coordinates.hibernate.TerminalDetails;
import com.testing.coordinates.model.Coordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/Coordinates")
public class CoordinatesController {
    @Autowired
    CoordinatesService coordinatesService;

    @GetMapping("/coord-test")
    public String coord(){
        return "Coordinates";
    }

    @PostMapping("/distance")
    public ResponseEntity<Double> getDistanceWithFixedSourceAndDestination(@RequestBody Coordinates coordinates){
        double distance = coordinatesService.getDistanceWithFixedSourceAndDestination(coordinates);
        return new ResponseEntity<Double>(distance, HttpStatus.OK);
    }

    @PostMapping("/distance2")
    public ResponseEntity<Double> getDistanceWithFixedSource(@RequestBody Coordinates coordinates,
                                                     @RequestParam("latitude2") double latitude2,
                                                     @RequestParam("longitude2") double longitude2){
        double distance = coordinatesService.getDistanceWithFixedSource(coordinates, latitude2, longitude2);
        return new ResponseEntity<Double>(distance, HttpStatus.OK);
    }

    @PostMapping("/distance3")
    public ResponseEntity<Double> getDistanceWithDynamicSourceAndDestination(@RequestParam("latitude1") double latitude1,
                                                     @RequestParam("longitude1") double longitude1,
                                                     @RequestParam("latitude2") double latitude2,
                                                     @RequestParam("longitude2") double longitude2){
        double distance = coordinatesService.getDistanceWithDynamicSourceAndDestination(latitude1, longitude1, latitude2, longitude2);
        return new ResponseEntity<Double>(distance, HttpStatus.OK);
    }

    @PostMapping("/fetchGeoCoordinates")
    public ResponseEntity<Double> fetchGeoCoordinate(@RequestParam("id") String id,
                                                     @RequestParam("GeoCoordinate") String GeoCoordinate,
                                                     @RequestParam("latitude2") double latitude2,
                                                     @RequestParam("longitude2") double longitude2){
        double terminal = coordinatesService.fetchGeoCoordinate(id, GeoCoordinate, latitude2, longitude2);
        return new ResponseEntity<>(terminal, HttpStatus.OK);
    }

    @PostMapping("/fetchGEORange")
    public ResponseEntity<String> fetchGeoRange(@RequestParam("institutionId") String institutionId,
                                                 @RequestParam("TerminalGEORange") Integer TerminalGEORange){
        String Range = (coordinatesService.fetchGeoRange(institutionId,TerminalGEORange));
        return new ResponseEntity<>(Range, HttpStatus.OK);
    }

}