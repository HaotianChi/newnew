package pkg3515lab0;
public class EquilateralTriangle extends Triangle{
    private double side;
    public EquilateralTriangle(String name) {
      super(name);
    }
    public void steDimension(double side) {
        this.side = side;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Name: Triangle");
        System.out.println("side: " + side);
        System.out.println("Area: " + getArea());
    }
    
    @Override
    public double getArea(){
        double s = (side*3) / 2;
        return Math.sqrt(s * (s - side) * (s - side) * (s - side));
    }
}
