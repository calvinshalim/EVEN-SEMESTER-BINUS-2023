package homework;

public class square extends rectangle {

    public square() {
        super();
    }

    public square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A square with side =" + this.getSide() + ", which is a subclass of " + super.toString();
    }
}