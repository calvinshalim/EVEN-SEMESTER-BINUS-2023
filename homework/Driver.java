package homework;

public class Driver {
    public static void main( String[] args ){
        circle C1 = new circle(50,"red",false);
        rectangle R1 = new rectangle(10,15,"yellow",true);
        square S1 = new square(15);


        System.out.println(C1.toString());
        System.out.println("C1 Area : " + C1.getArea());

        System.out.println("\n" + R1.toString());
        System.out.println("Area : " + R1.getArea());
        System.out.println("Perimeter : " + R1.getPerimeter());

        System.out.println("\n" + S1.toString());
        System.out.println("Area : " + S1.getArea());
        System.out.println("Perimeter : " + S1.getPerimeter());
    }
}
