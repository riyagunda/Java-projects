public class EvenDigitSum {
    public static void main(String[] args) {
        int f = getEvenDigitSum(239584);
        System.out.println(f);
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        } else {
            String a = Integer.toString(number);
            int len = a.length();
            int sum = 0;
            for(int i = 0; i<len; i++){
                int one = number%10;
                if(one%2==0){
                    sum+=one;
                }
                number/=10;
            }
            return sum;
        }
    }
}
