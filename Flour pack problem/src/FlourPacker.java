public class FlourPacker {

    public static void main(String[] args) {
        boolean check = canPack(2,5, 13);
        System.out.println(check);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int a = bigCount * 5;
        if (smallCount < 0 || bigCount < 0 || goal < 0)
            return false;

        if ((a + smallCount) < goal) {
            return false;
        }

        if ((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }
}
