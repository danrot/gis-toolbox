package at.fhv.gis.shapes;

import java.util.ArrayList;
import java.util.List;

public class Track
{
    private List<Point> points;

    public Track()
    {
        this(new ArrayList<Point>());
    }

    public Track(List<Point> points)
    {
        this.points = points;
    }

    public void addPoint(Point point)
    {
        this.points.add(point);
    }

    public double getLength()
    {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distanceTo(points.get(i + 1));
        }

        return length;
    }

    public double getSpeed()
    {
        double length = getLength();
        double time = (double)(points.get(points.size() - 1).getTime().getTime() - points.get(0).getTime().getTime()) / 1000;

        return length / time;
    }
}
