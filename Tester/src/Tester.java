import java.io.File;
import java.util.Scanner;

public class Tester {
    public static void main(String args) {
        Scanner in = new Scanner(new File("test-files/records.csv"));
        in.useDelimiter(",");   //sets the delimiter pattern
        while(in.hasNext())  //returns a boolean value
        {
            System.out.print(in.next());  //find and returns the next complete token from this scanner
        }
        in.close();
    }
}
