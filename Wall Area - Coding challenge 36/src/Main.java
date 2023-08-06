public class Main {
    public static void main(String[] args) {
        Wall measurements = new Wall(5,4);
        System.out.println(measurements.getArea());

        measurements.setHeight(-1.5);
        System.out.println(measurements.getWidth());
        System.out.println(measurements.getHeight());
        System.out.println(measurements.getArea());
    }
}
