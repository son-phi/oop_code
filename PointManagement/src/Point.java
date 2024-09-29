public class Point {
    private double x;
    private double y;
    public Point() {

    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point secondPoint) {
        double dx = this.x - secondPoint.x;
        double dy = this.y - secondPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
