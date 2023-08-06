public class getSum {

        public static void main(String[] args) {
            int check = sumDigits(93471);
            System.out.println(check);
        }

        public static int sumDigits(int number) {
            if(number < 10) {
                return -1;
            } else {
                int sum = 0;
                while (number > 0) {
                    int digit = number % 10;
                    sum += digit;
                    number /= 10;
                    continue;
                }
                return sum;
            }
        }
    }




