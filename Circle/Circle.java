public class Circle {

    private double radius;

    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        double v = Math.PI * Math.pow(radius, 2.0);
        return v;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

}
