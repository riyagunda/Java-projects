public class Mammal {
    private String name;
    private char body;
    private char brain;
    private char eyes;
    private char ears;
    private char mouth;

    public Mammal(String name, char brain, char eyes, char ears, char mouth) {
        this.name = name;
        this.body = 'y';
        this.brain = brain;
        this.eyes = eyes;
        this.ears = ears;
        this.mouth = mouth;
    }

    public void move(char body) {
        System.out.println(body);
    }
}
