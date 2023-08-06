import java.util.Scanner;

public class LargestPrime {

    public static void main(String[] args) {
        //int check = getLargestPrime(217);
        //System.out.println(check);
        Scanner scanner = new Scanner(System.in);
        boolean yesOrNo = scanner.hasNextInt();
        if (yesOrNo) {
            System.out.println("Enter a number:");
            int count = 0;
            int sum = 0;
            while (count <= 10) {
                int addNo = scanner.nextInt();
                count++;
                sum += addNo;
            }
        } else {
            System.out.println("Invalid number");
        }

        scanner.close();
    }
   // public static int getLargestPrime(int number) {
     //   if (number < 0)
       //     return -1;
        //else {

        //}
    //}
}
