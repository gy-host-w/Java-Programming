public class Lab4Task4 {
    public static void main(String[] args) {
        System.out.print("The grade is " + getGrade(78.5));
        System.out.print("\nThe grade is " + getGrade(59.5));
    }
    public static double getGrade(double grade) {
        if (grade >= 90.0) {
            return 'A';
        }
        else if (grade >= 80.0) {
            return 'B';
        }
        else if (grade >= 70.0) {
            return 'C';
        }
        else if (grade >= 60.0) {
            return 'D';
        }
        else
            return 'F';
    }
}
