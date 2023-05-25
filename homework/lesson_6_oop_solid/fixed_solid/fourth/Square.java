package fixed_solid.fourth;

public class Square extends Rectangle {

    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setHeight(int height) {
        super.height = height;
        super.width = height;
    }

    @Override
    public void setWidth(int width) {
        super.height = width;
        super.width = width;
    }
    
    
}
