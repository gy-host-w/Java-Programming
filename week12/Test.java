public class Test {
    public static void main(String[] args) {
        Student student = new Student("Alice",20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);

        student.setAge(-5);
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
