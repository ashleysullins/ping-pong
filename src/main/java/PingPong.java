import java.util.ArrayList;
import java.io.Console;

public class PingPong {
    public static void main(String[] args) {

        Console myConsole = System.console();
        System.out.println( "Enter a number." );
        String stringNumber = myConsole.readLine();
        Integer number = Integer.parseInt(stringNumber);

        ArrayList<String> listNumbers = new ArrayList<String>();

        for ( Integer numb = 1 ; numb <= number ; numb++) {
            String value = Integer.toString(numb);
            listNumbers.add(value);
        }

    System.out.println(listNumbers);
}

     public String pingPongTestResults(Integer numb) {
         if (numb % 15 == 0) {
             return "ping-pong";
         } else if (numb % 5 == 0) {
             return "pong";
         } else if (numb % 3 == 0) {
             return "ping";
         } else {
             return Integer.toString(numb);
         }
     }

}
