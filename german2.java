import java.util.Scanner; 

public class german2 { 
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
            int benz = gutenberg.nextInt();
            gutenberg.nextLine();
          }else{
            System.exit(0);
          }
          return marx;
  }
}