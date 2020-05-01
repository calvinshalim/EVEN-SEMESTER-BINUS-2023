package homework;

public class circle extends shape {
    private double radius = 1.0;

    public circle() {
        super();
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "A Circle with radius = " + this.radius + " , which is a subclass of " + super.toString();
    }
}