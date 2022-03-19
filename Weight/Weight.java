import java.util.Scanner;

class Weight {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter weight in kilograms: ");
      double aInput = input.nextDouble();

      
      double ounce = ((aInput / 0.45359237) - Math.floor(aInput / 0.45359237))*16;
      int pounds = (int)Math.floor(aInput / 0.45359237);

      System.out.printf("Equivalent imperial weight is %d lb %.1f oz", pounds, ounce);
    
  }
}