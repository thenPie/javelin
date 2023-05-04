
package src;

public class main {

    static Double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {

        Point2D a = new Point2D(0, 2);
        Point2D b = new Point2D(0, 10);

        Double dist = distance(a, b);

        System.out.println(dist);

    }
}
