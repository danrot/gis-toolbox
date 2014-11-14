package at.fhv.gis.shapes;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RectangleTest
{
    @Test
    public void createBoundingBox()
    {
        ArrayList<Point> points = new ArrayList<Point>();

        points.add(new Point(4, 3));
        points.add(new Point(4, 6));
        points.add(new Point(7, 5));
        points.add(new Point(8, 6));
        points.add(new Point(8, 3));

        Rectangle boundingBox = Rectangle.createBoundingBox(points);

        assertEquals(boundingBox.getX().getLatitude(), 4, 0);
        assertEquals(boundingBox.getX().getLongitude(), 3, 0);
        assertEquals(boundingBox.getY().getLatitude(), 8, 0);
        assertEquals(boundingBox.getY().getLongitude(), 6, 0);
    }
}