import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;

public class Circle implements Writeable{

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

    public void writeTo(Writer destination) throws IOException {
        DecimalFormat output = new DecimalFormat("0.0000");
        destination.write("Circle: r="+output.format(radius)+"\n");
        destination.flush();
    }
}
