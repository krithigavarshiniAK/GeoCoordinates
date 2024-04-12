
package com.testing.coordinates.Service;

import com.testing.coordinates.hibernate.TerminalDetails;
import com.testing.coordinates.model.Coordinates;

public interface CoordinatesService {
    public double getDistanceWithFixedSourceAndDestination(Coordinates coordinates);

    public double getDistanceWithFixedSource(Coordinates coordinates, double latitude2, double longitude2);

    public double getDistanceWithDynamicSourceAndDestination(double latitude1, double longitude1, double latitude2, double longitude2);

    public double fetchGeoCoordinate(String id, String GeoCoordinate, double latitude2, double longitude2);

    public String fetchGeoRange(String InstitutionId, Integer TerminalGEORange);


}

