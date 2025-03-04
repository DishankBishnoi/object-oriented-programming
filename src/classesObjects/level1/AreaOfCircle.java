package classesObjects.level1;


import java.util.Scanner;

class circle{


    void area(double radius){

        double area = Math.PI*Math.pow(radius, 2);
        System.out.println("The area of the circle is "+area);
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        circle c = new circle();
        c.area(radius);

    }
}
