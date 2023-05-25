package fixed_solid.fourth;

public class main {
    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle(2, 3);
        Square squ = new Square(3);
        Rectangle rs = new Square(2);

        System.out.println(rec.toString());
        System.out.println(squ.toString());
        System.out.println(rs.toString());

        System.out.println(rec.area());
        System.out.println(squ.area());
        System.out.println(rs.area());

        System.out.println();

        rec.setWidth(5);
        squ.setHeight(6);
        rs.setHeight(7);
        
        System.out.println(rec.toString());
        System.out.println(squ.toString());
        System.out.println(rs.toString());

        System.out.println(rec.area());
        System.out.println(squ.area());
        System.out.println(rs.area());
    }
}
