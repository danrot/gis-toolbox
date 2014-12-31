package at.fhv.gis.shapes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

public class TrackTest {
    @Test
    public void getSpeed()
    {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(47, 9, new Date(2015, 1, 1, 19, 0)));
        points.add(new Point(47, 10, new Date(2015, 1, 1, 20, 0)));
        points.add(new Point(47, 11, new Date(2015, 1, 1, 21, 0)));

        Track t = new Track(points);
        assertEquals(21.06, t.getSpeed(), 2);
    }
}
