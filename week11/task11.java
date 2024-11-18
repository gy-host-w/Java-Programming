import java.util.Arrays;
import java.util.Comparator;

class EmployeeTotalHoursComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e2.totalHours, e1.totalHours); // 降序排序
    }
}
class Employee {
    int id;
    int[] hours;
    int totalHours;

    Employee(int id, int[] hours) {
        this.id = id;
        this.hours = hours;
        this.totalHours = Arrays.stream(hours).sum();
    }
}

public class task11 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(0, new int[]{2, 4, 3, 4, 5, 8, 8}),
                new Employee(1, new int[]{7, 3, 4, 3, 4, 4, 4}),
                new Employee(2, new int[]{3, 3, 4, 3, 3, 2, 2}),
                new Employee(3, new int[]{9, 3, 4, 7, 3, 4, 1}),
                new Employee(4, new int[]{3, 5, 4, 3, 6, 3, 8}),
                new Employee(5, new int[]{3, 4, 4, 6, 3, 4, 4}),
                new Employee(6, new int[]{3, 7, 4, 8, 3, 8, 4}),
                new Employee(7, new int[]{6, 3, 5, 9, 2, 7, 9})
        };

        Arrays.sort(employees, new EmployeeTotalHoursComparator());

        for (Employee employee : employees) {
            System.out.println("Employee " + employee.id + ": " + employee.totalHours + " hours");
        }
    }
}