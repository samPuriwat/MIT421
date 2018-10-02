package lab7;

public class Rectangle {
    private double length;
    private double width;

    //constructor
    //default constructor
    public Rectangle() {
    }

    public Rectangle(
            double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getter and setter methods
    //get => read
    //set => edit
    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}//class
