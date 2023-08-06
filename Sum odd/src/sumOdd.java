public class sumOdd {
    public static void main(String[] args) {
        int t = sumOdd(100,1000);
        System.out.println(t);
    }
    public static boolean isOdd(int number){
        if(number>0) {
            if(number%2!=0){
                return true;
            }return false;
        }return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end>=start && start>0 && end>0){
            for(int i = start; i<=end; i++){
                if(isOdd(i)==true){
                    sum += i;
                }
            } return sum;
        } return -1;
    }
}
