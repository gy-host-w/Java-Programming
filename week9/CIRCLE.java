public class CIRCLE{
    public static void main(String[] args) {
        CIRCLE circle1 = new CIRCLE();
        System.out.println("The area of the circle of radius " +
                circle1.radius + " is " + circle1.getArea());
        CIRCLE circle2 = new CIRCLE(25);
        System.out.println("The area of the circle of radius " +
                circle2.radius + " is " + circle2.getArea());
        CIRCLE circle3 = new CIRCLE(125);
        System.out.println("The area of the circle of radius " +
                circle3.radius + " is " + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " +
                circle2.radius + " is " + circle2.getArea());
    }
    double radius;
    CIRCLE() {
        radius = 1.0;
    }
    CIRCLE(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
