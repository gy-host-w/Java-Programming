package demo1.week9;

class Circle2 {
    double radius;
    static int numberOfObjects=0;
    Circle2(double r) {
        radius =1;
        numberOfObjects++;
    }
    Circle2() {
        radius =1;
        numberOfObjects++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}
public class task7 {
    public static void main(String[] args) {
        System.out.println("Before creating any Circle objects:");
        System.out.println("Total number of Circle2 objects: " + Circle2.numberOfObjects);

        // 创建第一个Circle对象
        Circle2 c1 = new Circle2();
        System.out.println("\nAfter creating c1" );
        System.out.println("c1:radius = " + c1.radius+" and number of Circle objects = " +c1.numberOfObjects);
        Circle2 c2 = new Circle2(5);

        // 修改circle1的半径
        c1.radius=9;
        System.out.println("\nAfter creating c2 and modifying c1" );
        System.out.println("c1:radius = " + c1.radius+" and number of Circle objects = " +c1.numberOfObjects);
        System.out.println("c2:radius = " + c2.radius+" and number of Circle objects = " +c2.numberOfObjects);

    }
}
