public class DisplayTimeTuesday {
    public static void main(String[] args) {
        int td = 2;
        int days = 100;
        int remainingdays = days % 7;
        td = (td + remainingdays) % 7;

        System.out.println("It is day" + td + " in a week");
    }
}
