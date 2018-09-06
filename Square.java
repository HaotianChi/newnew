package pkg3515lab0;

public class Square extends Shape {
    private double length, height;
    
    public Square(String name) {
      super(name);
   }
    
    /*public String getName(String name) {
      name = "Square";
      return name;
   }*/

    public void steDimension(double length, double height) {
        this.height = height;
        this.length = length;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Name: Square");
        System.out.println("length: " + length + " " + "height: " + height);
        System.out.println("Area: " + getArea());
    }
    
    @Override
    public double getArea(){
        return height * length;
    }
}
