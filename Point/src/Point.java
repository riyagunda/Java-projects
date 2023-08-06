public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        double d1 = Math.sqrt((x * x) + (y * y));
        return d1;
    }

    public double distance(int x, int y) {
        double dx = Math.abs(this.x - x);
        double dy = Math.abs(this.y - y);
        double d = Math.sqrt((dx * dx) + (dy * dy));
        return d;
    }

    public double distance(Point another) {
        double dx = Math.abs(another.x - x);
        double dy = Math.abs(another.y - y);
        double d = Math.sqrt((dx * dx) + (dy * dy));
        return d;
    }
}
