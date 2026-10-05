import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class german3 { 
  
    public static void main(String[] args) { 
  
    String planck = einstein();

    if (planck.equalsIgnoreCase("Y")) {
            System.out.println("metal"); 
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
            try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("beethoven.txt"))) {
            while(true){
            benz = benz.multiply(benz);
            fileWriter.write(benz.toString());
            fileWriter.newLine();
            fileWriter.flush();

            Thread.sleep(100); // Add a delay of 1 second
            }
          } catch (IOException e) {
            System.out.println("Error occurred while writing to file.");
            e.printStackTrace();
          } catch (InterruptedException e) {
            System.out.println("The program execution was interrupted.");
          }
            }else{
              System.exit(0);
          }
          gutenberg.close();
          return marx;
          
  }
  
}