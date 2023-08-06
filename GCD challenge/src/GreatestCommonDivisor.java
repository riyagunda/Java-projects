public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int f = getGreatestCommonDivisor(12,30);
        System.out.println(f);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second < 10) {
            return -1;
        } else {
             int a = 0;
             int b = 0;
             for (int i = 1; i <= first; i++){
                 if(first%i == 0) {
                     a = i;
                     for (int j = 1; j <= second; j++){
                         if(second%j==0){
                            if(a==j)
                                b=j;
                         }
                     }
                 }
             } return b;
        }
    }
}
