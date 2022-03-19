public class main {
    public static void main(String[] args) {
        // Create a Clock set to a time just before midnight
        Circle circle = new Circle(5);
        System.out.print(circle.toString());
        Circle circleEmpty = new Circle();
        System.out.print(circleEmpty.getRadius());
        Circle circle2 = new Circle(5);
        System.out.print(circle.equals(circleEmpty));
        System.out.print(circle.equals(circle2));
    }
}
