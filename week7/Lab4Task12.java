import java.util.Scanner;
import java.util.Calendar;

public class Lab4Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 获取年份
        System.out.println("Enter full year (e.g.,2012):");
        int year = scanner.nextInt();

        // 获取月份
        System.out.println("Enter month as number between 1 and 12:");
        int month = scanner.nextInt();

        // 调用printCalendar方法打印日历
        printCalendar(year, month);

        scanner.close();
    }

    // 打印日历的方法
    public static void printCalendar(int year, int month) {
        // 使用Java的Calendar类来获取月份的天数
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // 注意：Calendar月份是从0开始的
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // 打印月份标题
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("----------------------------");
        // 打印星期几的标题
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // 计算当前月份第一天是星期几
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 注意：这里获取的值是1-7，需要转换为0-6
        if (firstDayOfWeek == 0) {
            firstDayOfWeek = 7; // 调整为Java Calendar的索引方式
        }

        // 打印日期前的空格
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // 打印日期
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
    }

    // 获取月份名称的方法
    public static String getMonthName(int month) {
        String[] monthNames = {
                "Invalid", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
    }
}