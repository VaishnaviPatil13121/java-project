import java.lang.*;
import java.util.*; // package to user input


public class Shape {

    public Shape(double r) {
        System.out.println("Perimeter=" + 2 * 3.14 * r);
    }

    public Shape(int l, int w) {
        System.out.println("Area=" + l * w);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner object sc

        System.out.print("\n Enter Radius:");
        double r = sc.nextDouble();

        Shape C = new Shape(r); //calling the first constrcuter

        System.out.print("\n Enter Length:");
        int l = sc.nextInt();

        System.out.print("\n Enter width");
        int w = sc.nextInt();

        Shape R = new Shape(l, w); //calling the second constrcuter



    }
}