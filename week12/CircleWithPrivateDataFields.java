public class CircleWithPrivateDataFields {
    private double radius = 1;

    private static int numberOfobjects = 0;

    public CircleWithPrivateDataFields() {
        numberOfobjects++;
    }

    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfobjects++;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfobjects() {
        return numberOfobjects;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
