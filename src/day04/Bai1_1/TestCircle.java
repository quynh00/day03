package day04.Bai1_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hình trờn có bán kính  "
                + c1.getRadius() + " diện tích " + c1.getArea());

        Circle c2 = new Circle(3.0, "black");
        System.out.println("The circle has radius of "
                + c2.getRadius() + ", màu " + c2.getColor()+
                ", diện tích " + c2.getArea() + ", chu vi "+ c2.Circumference());
    }
}
