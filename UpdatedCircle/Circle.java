public class Circle {

    private double radius;

    public Circle(double r){
        if (r <= 0.0){
            throw new IllegalArgumentException("Invalid radius");
        }
        else {
            radius = r;
        }
    }
    public Circle(){
        this(1.0);
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

    @Override
    public String toString(){
        return String.format("Circle(radius=%.4f)", radius);
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        else if (other instanceof Circle) {
            Circle otherCircle = (Circle) other;
            if (Math.abs(otherCircle.getRadius()-radius) < 0.00005 || Math.abs(radius-otherCircle.getRadius())<0.00005){
                return true;
            }

        }
        return false;

    }
}
