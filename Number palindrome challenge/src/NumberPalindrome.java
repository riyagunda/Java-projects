public class NumberPalindrome {
    public static void main(String[] args){
        boolean ans = isPalindrome(80255208);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int number) {
        String con = Integer.toString(number);
        int len = con.length();
        int count = 0;
        int value = number;
        String reverse = "";
        for(int i = 0; i < len; i++) {
            int last = number%10;
            String a = Integer.toString(last);
            reverse += a;
            number= number/10;
            count++;
        }
        int reverseInt = Integer.valueOf(reverse);
        if (reverseInt==value){
            return true;
        } else {
            return false;
        }
    }
}
