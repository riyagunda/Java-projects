public class Practice {
    public static void main(String[] args) {
        int print = reverse(5);
        System.out.println(print);
    }
    public static int reverse(int number){
        int t = 0;
        boolean negValue = number<0;
        if(number<0){
           number*=-1;
        }
        if (getDigitCount(number)>=2){
            while(number > 0){
                int a = number%10;
                t += a;
                t*=10;
                number/=10;
            }
            t/=10;
        } else if(getDigitCount(number)==1){
            t = number;
        }
        if(negValue == true){
            t*=-1;
        }
        return t;
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int revNumber = reverse(number);
            int checker = 0;
            do{
                int r = revNumber;
                r%=10;
                switch(r){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                checker+=1;
                revNumber/=10;
            } while (revNumber > 0);
            if(getDigitCount(number) > checker){
                int a = getDigitCount(number) - checker;
                for(int i = 1; i <= a; i++){
                    System.out.print("Zero ");
                }
            }
        }


    }
    public static int getDigitCount(int number){
        int c = 0;
        if (number < 0)
            return -1;
        else if (number == 0){
            c++;
        }
        while (number > 0){
            number/=10;
            c++;
        }

        return c;
    }
}