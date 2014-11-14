package at.fhv.gis.shapes;

import java.util.List;

/**
 * Created by daniel on 14.11.2014.
 */
public class Rectangle
{
    private Point x;

    private Point y;

    public Rectangle(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public static Rectangle createBoundingBox(List<Point> points)
    {
        double minX = points.get(0).getLatitude(), minY = points.get(0).getLongitude(), maxX = minX, maxY = minY;

        for (Point p : points)
        {
            if (p.getLatitude() < minX)
            {
                minX = p.getLatitude();
            }

            if (p.getLatitude() > minX)
            {
                maxX = p.getLatitude();
            }

            if (p.getLongitude() < minY)
            {
                minY = p.getLongitude();
            }

            if (p.getLongitude() > minY)
            {
                maxY = p.getLongitude();
            }
        }

        return new Rectangle(new Point(minX, minY), new Point(maxX, maxY));
    }
}
