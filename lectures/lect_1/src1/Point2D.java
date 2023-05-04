
package src;

/**
 * Класс, создающий точку с данными координатами
 * в двухмерном пространстве.
 */
public class Point2D {

    private Integer x;
    private Integer y;

    /**
     * Это конструктор
     * @param x - это координата X
     * @param y - это координата Y
     */
    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    // /**
    //  * Устанавливает точку в двухмерном пространстве перегрузкой.
    //  * @param x
    //  */
    // public Point2D(Integer x) {
    //     this.x = x;
    //     this.y = x;
    // }

    /**
     * Устанавливает координату для X
     * @param x
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * Устанавливает координату для Y
     * @param y
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Возвращает координату точки X
     * @return
     */
    public Integer getX() {
        return x;
    }

    /**
     * Возвращает координату точки Y
     * @return
     */
    public Integer getY() {
        return y;
    }

    public static Double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
