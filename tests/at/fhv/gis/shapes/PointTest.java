package at.fhv.gis.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest
{
    @Test
    public void distanceTo()
    {
        Point dornbirn = new Point(47.413417, 9.744417);
        Point feldkirch = new Point(47.238056, 9.598333);

        assertEquals(22410, dornbirn.distanceTo(feldkirch), 100);
    }
}