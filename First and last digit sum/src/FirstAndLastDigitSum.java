public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int check = sumFirstAndLastDigit(2345);
        System.out.println(check);
    }
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        if (number < 0) {
            return -1;
        } else {
            lastDigit = number % 10;
            while (number > 9){
                number /= 10;
            }
            int a = lastDigit + number;
            return a;
        }
    }

}
