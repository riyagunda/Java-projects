import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(true) {
            int order = count + 1;
            System.out.println("Enter number #" + order + " : ");

            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;

            } else {
                System.out.println("Invalid number");
            }

            if (count == 10)
                break;
            scanner.nextLine(); // empties buffer of the enter key (needs to be used if enter key is used)

        }
        System.out.println(sum);
        scanner.close();
    }
}
