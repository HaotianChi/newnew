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
public class Circle extends Shape {
    private double radius;
    
    public Circle(String name) {
      super(name);
   }

    public void steDimension(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Name: Circle");
        System.out.println("radius: " + radius);
        System.out.println("Area: " + getArea());
    }
    
    @Override
    public double getArea(){
        return radius*radius*3.14159;
    }

}
