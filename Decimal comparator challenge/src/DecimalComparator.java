public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.0,3.0);
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double one = a*1000;
        int c = (int) one;
        double two = b*1000;
        int d = (int) two;

        if((a<0 && b>0) || (a>0 && b<0)) {
            return false;
        } else if (c==d){
           return true;
        } return false;

    }
}
