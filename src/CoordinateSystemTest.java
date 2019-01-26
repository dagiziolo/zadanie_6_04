import java.util.Scanner;

public class CoordinateSystemTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point point = new Point();
        System.out.println("Podaj X:");
        point.setX(scan.nextDouble());
        System.out.println("Podaj Y");
        point.setY(scan.nextDouble());
        CoordinateSystem coordinateSystem = new CoordinateSystem();
        System.out.printf("Punkt (%.2f, %.2f) leży w %s ćwiartce układu współrzędnych."
                , point.getX(), point.getY(), coordinateSystem.quarter(point));
    }
}
