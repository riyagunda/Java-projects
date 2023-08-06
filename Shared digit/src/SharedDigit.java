public class SharedDigit {
    public static void main(String[] args) {
        boolean check = hasSharedDigit(9,9);
        System.out.println(check);
    }
    public static boolean hasSharedDigit(int a, int b) {
        if ((10 <= a && a <= 99) && (10 <= b && b <= 99)) {
            int ald = a % 10;
            int bld = b % 10;
            a /= 10;
            b /= 10;
            int afd = a;
            int bfd = b;
            return ((ald == bld) || (ald == bfd) || (afd == bfd) || (afd == bld));
        } else {
            return false;
        }
    }
}
