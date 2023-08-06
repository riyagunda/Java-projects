public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        } else if (barking == true) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
    }       return false; }
}
