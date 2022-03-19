import java.lang.reflect.Array;

public class MeanValue {
  public static double meanValue(double[] data) {

    double sum=0;
    int numOfValues=0;
    for (int i=0; i<data.length; i++){
      sum += (double)Array.get(data, i);
      numOfValues++;
    }
    return sum/numOfValues;

  }

  public static void main(String[] args) {


    if(args.length == 0){
       System.err.println("Usage: java MeanValue <values...>");
       System.exit(1);
   }
   double[] arrayOfValues = new double[args.length];
   for (int i=0; i<args.length; i++){
    arrayOfValues[i] = Double.parseDouble(args[i]);
  }

   System.out.printf("Mean value = %.3f", meanValue(arrayOfValues));

  }
}
