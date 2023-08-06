public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int check = getGreatestCommonDivisor(-20,15);
        System.out.println(check);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first >= 10) && (second >= 10)) {
            int a = 0;
            for(int i = 1; ((i <= first) && (i <= second)); i++) {
                if ((first % i == 0) && (second % i == 0))
                    a = i;
            }
            return a;
        }
        return -1;

    }
}
