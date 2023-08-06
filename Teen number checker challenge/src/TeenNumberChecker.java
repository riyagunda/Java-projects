public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean a = hasTeen(19, 13,41);
        System.out.println(a);
    }
    public static boolean hasTeen(int a, int b, int c){
        if((a>19||a<13) && (b>19||b<13) && (c>19||c<13)) {
            return false;
        } return true;
    }
}
