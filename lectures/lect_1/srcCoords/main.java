
package srcCoords;

public class main {

    // /**
    //  * Считывает дистанцию между двумя точками в двухмерном пространстве.
    //  * @param a - первая точка.
    //  * @param b - вторая точка.
    //  * @return Дистанция между точками.
    //  */
    // static Double distance(Point2D a, Point2D b) {
    //     return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    // }

    public static void main(String[] args) {

        /**
         Point2D a = new Point2D(3);
         Point2D b = new Point2D(6);
         
         Double dis = distance(a, b);
         System.out.println(dis);
         */
        
        Point2D a = new Point2D(0, 2);
        Point2D b = new Point2D(0, 10);
        
        var dist = Point2D.distance(a, b);
        System.out.println(dist);

    }
}
