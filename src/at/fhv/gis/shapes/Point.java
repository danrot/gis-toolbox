package at.fhv.gis.shapes;

/**
 * Created by daniel on 14.11.2014.
 */
public class Point {
    private double latitude;

    private double longitude;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double distanceTo(Point point)
    {
        double latitude1 = Math.toRadians(this.latitude);
        double latitude2 = Math.toRadians(point.latitude);
        double longitude1 = Math.toRadians(this.longitude);
        double longitude2 = Math.toRadians(point.longitude);

        double result = Math.acos(
                Math.sin(latitude1)*Math.sin(latitude2) +
                        Math.cos(latitude1)*Math.cos(latitude2)*Math.cos(longitude1 - longitude2)
        );

        return result / (2 * Math.PI) * 40007863;
    }
}
