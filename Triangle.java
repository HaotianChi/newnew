/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3515lab0;

/**
 *
 * @author Qinghua
 */
public class Triangle extends Shape{
    private double side1, side2, side3;
    
    public Triangle(String name) {
      super(name);
   }
   public void steDimension(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Name: Triangle");
        System.out.println("side1: " + side1 + " " + "side2: " + side2 + " " + "side3: " + side3);
        System.out.println("Area: " + getArea());
    }
    
    @Override
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
