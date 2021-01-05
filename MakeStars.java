import java.util.*;
public class MakeStars {

  public static void main( String[]args ){
      Scanner n = new Scanner(System.in);
      while (n.hasNextLine()) {
        String line = n.nextLine();
        Scanner w = new Scanner(line);
        while (w.hasNext()) {
          int length = w.next().length();
          int i = 0;
          while (i < length) {
            System.out.print("*");
            i++;
          }
          System.out.print(" ");
        }
        System.out.print("\n");
      }
  }

}
