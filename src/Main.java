import at.fhv.gis.shapes.Point;
import at.fhv.gis.shapes.Track;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new LinkedList<Point>();
        points.add(new Point(9.69293568, 47.19542667));
        points.add(new Point(9.69293568, 47.19542667));
        points.add(new Point(9.69274478, 47.19545973));
        points.add(new Point(9.69253999, 47.1953788));
        points.add(new Point(9.69232841, 47.19546704));
        points.add(new Point(9.6922678, 47.1954861));
        points.add(new Point(9.69224781, 47.19548913));
        points.add(new Point(9.69221554, 47.19546929));
        points.add(new Point(9.69214297, 47.19544633));
        points.add(new Point(9.69211809, 47.1954269));
        points.add(new Point(9.69209941, 47.19541563));
        points.add(new Point(9.69209209, 47.19540472));
        points.add(new Point(9.69208939, 47.19539396));
        points.add(new Point(9.6920977, 47.19538328));
        points.add(new Point(9.69210778, 47.19538125));
        points.add(new Point(9.69212643, 47.1953688));
        points.add(new Point(9.692151, 47.19536805));
        points.add(new Point(9.69214852, 47.19531485));
        points.add(new Point(9.69216222, 47.19529865));
        points.add(new Point(9.69217602, 47.19526593));
        points.add(new Point(9.69219061, 47.19526022));
        points.add(new Point(9.692203, 47.19525146));
        points.add(new Point(9.69221534, 47.19524344));
        points.add(new Point(9.69222828, 47.19523743));
        points.add(new Point(9.6922387, 47.19523282));
        points.add(new Point(9.69224927, 47.19522619));
        points.add(new Point(9.69226197, 47.19522179));
        points.add(new Point(9.69227816, 47.19521831));
        points.add(new Point(9.69229349, 47.19521472));
        points.add(new Point(9.69230625, 47.19520921));
        points.add(new Point(9.69231809, 47.19520846));
        points.add(new Point(9.69233279, 47.19520921));
        points.add(new Point(9.69234809, 47.19520863));
        points.add(new Point(9.69236478, 47.19520808));
        points.add(new Point(9.6923824, 47.19520495));
        points.add(new Point(9.69240161, 47.19520068));
        points.add(new Point(9.69242142, 47.19519521));
        points.add(new Point(9.69244098, 47.19518859));
        points.add(new Point(9.69245863, 47.19518113));
        points.add(new Point(9.6924772, 47.19517338));
        points.add(new Point(9.69249568, 47.1951654));
        points.add(new Point(9.69251449, 47.19515886));
        points.add(new Point(9.69253414, 47.19515537));
        points.add(new Point(9.69255487, 47.19515219));
        points.add(new Point(9.69257607, 47.19514885));
        points.add(new Point(9.69259628, 47.19514344));
        points.add(new Point(9.69261664, 47.19513921));
        points.add(new Point(9.69263684, 47.19513516));
        points.add(new Point(9.69265707, 47.19513059));
        points.add(new Point(9.69267716, 47.19512552));
        points.add(new Point(9.69269634, 47.19512004));
        points.add(new Point(9.69271572, 47.19511351));
        points.add(new Point(9.69273467, 47.19510733));
        points.add(new Point(9.69275384, 47.19510111));
        points.add(new Point(9.69277332, 47.19509525));
        points.add(new Point(9.69279274, 47.19508916));
        points.add(new Point(9.69281018, 47.19508165));
        points.add(new Point(9.69282799, 47.19507489));
        points.add(new Point(9.6928456, 47.19506886));
        points.add(new Point(9.69286244, 47.19506152));
        points.add(new Point(9.69287919, 47.1950541));
        points.add(new Point(9.69289565, 47.19504736));
        points.add(new Point(9.69291187, 47.19504276));

        Track track = new Track(points);
        System.out.println(track.getLength());
    }
}
