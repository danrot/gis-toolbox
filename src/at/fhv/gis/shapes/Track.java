package at.fhv.gis.shapes;

import java.util.List;

public class Track
{
    private List<Point> points;

    public Track(List<Point> points)
    {
        this.points = points;
    }

    public double getLength()
    {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distanceTo(points.get(i + 1));
        }

        return length;
    }
}
