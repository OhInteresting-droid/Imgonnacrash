import java.math.BigInteger;
import java.util.Scanner;

public class german2 { 
    public static void main(String[] args) { 
    String planck = einstein(); 
    }
    }
  public static String einstein() {
          Scanner gutenberg = new Scanner(System.in); 
          System.out.println("Y or N: ");
          String marx = gutenberg.nextLine();
          if (marx.equalsIgnoreCase("Y")) {
            System.out.println("Enter a Number");
            String Pompeji = gutenberg.nextLine();
            BigInteger benz = new BigInteger(Pompeji);
            while(true){
            benz = benz.multiply(benz);
            System.out.println(benz);
            gutenberg.nextLine();
            }
          }else{
            System.exit(0);
          }
          return marx;
  }
}