public class FirstLastDigitSum {
    public static void main(String[] args) {
        int f = sumFirstAndLastDigit(5);
        System.out.println(f);
    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int sum = number%10;
        int count = 0;
        String a = Integer.toString(number);
        int len = a.length();
        for(int i=0; i<len; i++) {
            if (len==1){
                number=number;
            } else if (len >= 2) {
                number/=10;
                count++; }
            if((count+1)==len){
                sum=sum+ number;
                break; }
            }
        return sum;
        }
    }

