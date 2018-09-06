package pkg3515lab0;

import java.util.Scanner; 

public class Main {
    public double length, height, radius, side1, side2, side3, side;

    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the length:");
       double length = input.nextDouble();
       System.out.println("Enter the height:");
       double height = input.nextDouble();
       System.out.println("Enter the radius:");
       double radius = input.nextDouble();
       System.out.println("Enter the side1:");
       double side1 = input.nextDouble();
       System.out.println("Enter the side2:");
       double side2 = input.nextDouble();
       System.out.println("Enter the side3:");
       double side3 = input.nextDouble();
       System.out.println("Enter the side of EquilateralTriangle:");
       double side = input.nextDouble();
              
       System.out.println("");
       System.out.println("");
       Square sq = new Square("Square");
       sq.steDimension(length, height);
       sq.printDimensions();
       System.out.println("");
       Circle ci = new Circle("Circle");
       ci.steDimension(radius);
       ci.printDimensions();
       System.out.println("");
       Triangle tr = new Triangle("Triangle");
       tr.steDimension(side1, side2, side3);
       tr.printDimensions();
       System.out.println("");
       EquilateralTriangle eq = new EquilateralTriangle("EquilateralTriangle");
       eq.steDimension(side);
       eq.printDimensions();
    }   
}
