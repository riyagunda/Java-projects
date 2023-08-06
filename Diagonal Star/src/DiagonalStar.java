public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(10);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for(int row = 1; row <= number; row++){
            System.out.println(" ");
            for(int col = 1; col <= number; col++) {
                if (col == 1 || row ==1 || col == number ||row == number ){
                    System.out.print("*");
                } else if (row == col){
                    System.out.print("*");
                } else if (col == (number - row + 1)){
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
        }
    }

}
