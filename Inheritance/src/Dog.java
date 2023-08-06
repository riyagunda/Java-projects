public class Dog extends Mammal{
    private char tails;
    private char four_legged;
    private char fur;
// why was there an error when dog constructor was not created?
    // why cant i do super.variable_name = variable_name
    //constructor chaining
    public Dog(String name, char eyes, char ears, char mouth, char tails, char four_legged, char fur) {
        super(name,'y',eyes,ears,mouth); //--> this line confusion
        this.tails = tails;
        this.four_legged = four_legged;
        this.fur = fur;

    }
    public void printerTester() {
        System.out.println(fur);
    }


}
