package atm;

import java.util.List;

public class CoordinateOutputFormatter {
    private boolean latFirst;

    public CoordinateOutputFormatter(boolean latFirst) {
        this.latFirst = latFirst;
    }

    public String parse(List<AircraftTarget> targets) {
        var sb = new StringBuilder();
        if (latFirst) {
            buildLatLon(targets, sb);
        } else {
            buildLonLat(targets, sb);
        }

        return sb.toString();
    }

    private static void buildLonLat(List<AircraftTarget> targets, StringBuilder sb) {
        targets.forEach(a -> sb
                .append("[")
                .append(a.lon())
                .append(" ")
                .append(a.lat())
                .append("] "));
    }

    private static void buildLatLon(List<AircraftTarget> targets, StringBuilder sb) {
        targets.forEach(a -> sb
                .append("[")
                .append(a.lat())
                .append(" ")
                .append(a.lon())
                .append("] "));
    }


}
