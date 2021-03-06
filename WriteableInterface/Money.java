import java.io.IOException;
import java.io.Writer;

public class Money implements Writeable{
  private int euros, cents;

  public Money(int e, int c) {
    euros = e;
    cents = c;
  }

  public int getEuros() {
    return euros;
  }

  public int getCents() {
    return cents;
  }

  public Money plus(Money other) {
    int sumEuros = euros + other.euros;
    int sumCents = cents + other.cents;
    return new Money(sumEuros + sumCents / 100, sumCents % 100);
  }
  public void writeTo(Writer destination) throws IOException {
    String output;
    if (cents<10){
      output="0"+cents;
    }
    else{
      output= ""+cents;
    }
    destination.write("Money: €"+euros+"."+output+"\n");
    destination.flush();
  }
}
