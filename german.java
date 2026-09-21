import java.util.Arrays;
import java.util.Scanner;

public class german {
    public static void main(String[] args) {
    Scanner gutenberg = new Scanner(System.in);
    int Einstein = 1;
    String[] marx = new String[Einstein];
    System.out.println("Enter Your Name: ");
    for(int i = 0; i < marx.length; i++) {
        marx[i] = gutenberg.nextLine();
    }
    
    System.out.println(Arrays.toString(marx));

    gutenberg.close();
    
    }
}
