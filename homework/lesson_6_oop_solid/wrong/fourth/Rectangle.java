package wrong.fourth;

public class Rectangle {
    protected int width;
    protected int height;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}
