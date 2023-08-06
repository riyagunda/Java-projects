public class NumberToWords {

    public static void main(String[] args) {
        //int check = reverse(-14);
        //System.out.println(check);
        numberToWords(0);
    }

    public static void numberToWords (int number) {
        if(number >= 0) {
            int r = reverse(number);
            int digitLen = getDigitCount(number);
            for (int i = 0; i < digitLen; i++) {
                int ld = r % 10;
                switch (ld) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
                r /= 10;
            }

        } else {
            System.out.println("Invalid Value");
        }

    }

    public static int reverse(int a) {
        int reverse = 0;
        int copy = a;
        while (copy != 0) {
            int b = copy % 10;
            reverse = (reverse * 10) + b;
            copy /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number >= 0) {
            int copy = number;
            int count = 0;

            if (number == 0)
                count = 1;

            while(copy != 0){
                copy /= 10;
                count++;
            }
            return count;
        } else {
            return -1;
        }
    }
}

