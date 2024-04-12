package com.testing.coordinates.Service.Imple;

import com.testing.coordinates.Service.CoordinatesService;
import com.testing.coordinates.hibernate.InstitutionTerminalConfig;
import com.testing.coordinates.hibernate.TerminalDetails;
import com.testing.coordinates.model.Coordinates;
import ogs.switchon.common.hibernate_loader.CommonHibernateDAO;
import ogs.switchon.common.hibernate_loader.HibernateSessionFactoryHelper;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class CoordinatesServiceImple implements CoordinatesService {
    private static final double EARTH_RADIUS = 6371;

    @Autowired
    TerminalDetails terminal;

    @Autowired
    InstitutionTerminalConfig institution;

    @Override
    public double getDistanceWithFixedSourceAndDestination(Coordinates coordinates) {
        System.out.println("Inside Calculate Distance method");
        //converting degree to radians.
        double latitude1 = Math.toRadians(coordinates.getLatitude1());
        double longitude1 = Math.toRadians(coordinates.getLongitude1());
        double latitude2 = Math.toRadians(coordinates.getLatitude2());
        double longitude2 = Math.toRadians(coordinates.getLongitude2());

        double meters = radiansIntoMeters(latitude1, longitude1, latitude2, longitude2);
        return meters;
    }

    @Override
    public double getDistanceWithFixedSource(Coordinates coordinates, double latitude2, double longitude2) {
        System.out.println("Inside Calculate Distance method 1");

        if (!isValidLatitude(latitude2) || !isValidLongitude(longitude2)) {
            throw new IllegalArgumentException("Invalid latitude or longitude values");
        }
        //converting degree to radians.
        double latitude1 = Math.toRadians(coordinates.getLatitude1());
        double longitude1 = Math.toRadians(coordinates.getLongitude1());
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        //finding the distance between two latitude and longitude.
        double meters = radiansIntoMeters(latitude1, longitude1, latitude2, longitude2);
        return meters;
    }

    @Override
    public double getDistanceWithDynamicSourceAndDestination(double latitude1, double longitude1, double latitude2, double longitude2) {
        System.out.println("Inside Calculate Distance method 2");

        if (!isValidLatitude(latitude1) || !isValidLongitude(longitude1) || !isValidLatitude(latitude2) || !isValidLongitude(longitude2)) {
            throw new IllegalArgumentException("Invalid latitude or longitude values");
        }

        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        double meters = radiansIntoMeters(latitude1, longitude1, latitude2, longitude2);

        return meters;
    }

    @Override
    public double fetchGeoCoordinate(String id, String GeoCoordinate,double latitude2,double longitude2) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateSessionFactoryHelper.getSession();
            session.beginTransaction();

            terminal = CommonHibernateDAO.getObjectWithId(TerminalDetails.class, id, session);
            CommonHibernateDAO.updateObjectProperty(TerminalDetails.class, "id", id, "GeoCoordinate", GeoCoordinate, session);

            double distance = getDistanceWithFixedCoordinates(GeoCoordinate,latitude2,longitude2);
            System.out.println("Reference Distance: "+distance);
            session.getTransaction().commit();

            return distance;
        } catch (Exception e) {
            throw new RuntimeException("Fetch Failed.", e);
        } finally {
            HibernateSessionFactoryHelper.closeSession();
        }
    }

    private double getDistanceWithFixedCoordinates(String GeoCoordinate, double latitude2, double longitude2) {

        String[] parts = GeoCoordinate.split(",");
        double longitude1 = 0,latitude1 =0;
        if (parts.length == 2) {
            latitude1 = Double.parseDouble(parts[0]);
            longitude1 = Double.parseDouble(parts[1]);
        }
        System.out.println("After splitting latitude and longitude.");
        System.out.println(latitude1 + "," + longitude1);
        System.out.println(latitude2 + "," + longitude2);

        if (!isValidLatitude(latitude1) || !isValidLongitude(longitude1) || !isValidLatitude(latitude2) || !isValidLongitude(longitude2)) {
            throw new IllegalArgumentException("Invalid latitude or longitude values");
        }

        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        double distance = radiansIntoMeters(latitude1, longitude1, latitude2, longitude2);
        return distance;
    }

    @Override
    public String fetchGeoRange(String institutionId, Integer TerminalGEORange) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateSessionFactoryHelper.getSession();
            session.beginTransaction();

            institution = CommonHibernateDAO.getObjectWithId(InstitutionTerminalConfig.class, institutionId, session);
            CommonHibernateDAO.updateObjectProperty(InstitutionTerminalConfig.class, "institutionId", institutionId, "TerminalGEORange", 10, session);

            double referenceDistance = TerminalGEORange;
            Boolean Compare = compareDistances(referenceDistance);
            System.out.println("Comparison Output: "+Compare);

            return "GeoCoordinates fetched from table terminal_details with ID : " +institution.getInstitutionId();
        } catch (Exception e) {
            throw new RuntimeException("Fetch Failed.", e);
        } finally {
            HibernateSessionFactoryHelper.closeSession();
        }
    }
    private Boolean compareDistances(double referenceDistance) {

        double distance1 = fetchGeoCoordinate("000000000000020", "9.9252,78.1198", 13.0826, 80.2707);
        System.out.println("Distance1: "+distance1);

        Coordinates coordinates = new Coordinates(9.9252,78.1198);
        double distance2 = getDistanceWithFixedSource(coordinates, 13.0826, 80.2707);
        System.out.println("Distance2: "+distance2);

        double distance3 = distance2 - distance1;
        System.out.println("Distance3: "+distance3);

        if (distance3 > referenceDistance) {
            System.out.println("Distance is greater than reference distance");
            return false;
        } else {
            System.out.println("Distance is less than or equal to reference distance");
            return true;
        }
    }

    private boolean isValidLatitude(double latitude) {
        return latitude >= -90 && latitude <= 90;
    }

    private boolean isValidLongitude(double longitude)
    {
        return longitude >= -180 && longitude <= 180;
    }

    //finding the distance between two latitude and longitude.
    private double radiansIntoMeters(double latitude1, double longitude1, double latitude2, double longitude2) {
        double a = Math.pow(Math.sin((latitude2 - latitude1) / 2), 2) +
                Math.cos(latitude1) * Math.cos(latitude2) *
                        Math.pow(Math.sin((longitude2 - longitude1) / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = EARTH_RADIUS * c * 1000;
        return distance;
    }
}