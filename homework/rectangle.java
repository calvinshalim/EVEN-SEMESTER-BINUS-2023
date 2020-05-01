package homework;

public class rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;

    public rectangle() {
        super();
    }

    public rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public rectangle(double width, double length,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return "A Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " + super.toString();
    }
}