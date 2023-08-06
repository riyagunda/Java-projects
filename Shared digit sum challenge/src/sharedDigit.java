public class sharedDigit {

    public static boolean hasSharedDigits(int one, int two){
        if (one < 10 || two < 10 || one > 99 || two >99) {
            return false;
        } else {
            int ao = one%10;
            one/=10;
            int bo = two%10;
            two/=10;
            if(one==two||ao==two||bo==one||ao==bo){
                return true;
            } else {
            return false; }

        }
    }
}
