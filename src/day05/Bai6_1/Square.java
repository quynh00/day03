package day05.Bai6_1;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side){
        width = length = side;
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }    public double getSide(){
        return length;
    }
    public void setSide(double side){
        length = width = side;
    }
    public void setWidth(double side){
        setSide(side);
    }
    public String toString(){
        return "Square [" + super.toString() +
                ", width=" + width +
                ", length=" + length +
                "]";
    }
}
