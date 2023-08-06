import java.util.Scanner;
// how does the while loop break as soon as an incorrect string of data is entered??
public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int min = 0;
        //int max = 0;
        //boolean firstCheck = true;
        int min = 2147483647; // or Integer.MAX_VALUE;
        int max = -2147483647; // or Integer.MIN_VALUE;

        while(true){
            System.out.println("Enter a number: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();

                //if(firstCheck) {
                  //  firstCheck = false;
                    //min = number;
                    //max = number;
                //}

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The smallest number you have entered " + min);
        System.out.println("The largest number you have entered " + max);
        scanner.close();
    }
}
