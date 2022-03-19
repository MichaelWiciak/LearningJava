import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset {

    private ArrayList<Double> data = new ArrayList<Double>();

    public Dataset(String filename) throws IOException {
        try (Scanner input = new Scanner(Paths.get(filename))) {

            // Fetch lines for as long as we can...

            while (input.hasNextLine()) {
                String line = input.nextLine();
                double num = Double.parseDouble(line);
                data.add(num);
            }
        }
    }
    public int size(){
        return data.size();
    }

    public double meanValue() throws ArithmeticException{
        double total=0;
        if (data.isEmpty()){
            throw new ArithmeticException("Empty Set");
        }
        for (double s: data){
            total += s;
        }
        return (total/data.size());
    }
}