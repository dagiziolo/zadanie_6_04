public class CoordinateSystem {
    public String quarter(Point point) {
        if (point.getX() > 0) {
            if (point.getY() >= 0) {
                return "I";
            } else {
                return "IV";
            }
        } else {
            if (point.getY() >= 0) {
                return "II";
            } else {
                return "III";
            }
        }
    }
}
