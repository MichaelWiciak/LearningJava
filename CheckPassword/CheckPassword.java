

public class CheckPassword {
  public static boolean longEnough(String password) {

    if (password.length()>=12){
      return true;
    }

    return false;
}

  public static boolean atLeastTwoDigits(String password) {
    int digitCounter = 0;
    for (int i=0; i<password.length(); i++){
      if (Character.isDigit(password.charAt(i))==true){
        digitCounter++;
      }
    }

    if (digitCounter>=2){
      return true;
    }
    return false;
    }

  public static void main(String[] args) {

    if(args.length == 0){
       System.err.println("Usage: java CheckPassword <password> ");
       System.exit(1);
   }

    if (longEnough(args[0])==true && atLeastTwoDigits(args[0])==true){
      System.out.print("Password is valid");
    }
    else{
      System.out.print("Password is not valid");
    }
  }
}
