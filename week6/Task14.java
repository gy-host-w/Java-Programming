public class Task14 {
    public static void main(String[] args) {
        int initialTuition = 10000;
        double annualIncrease = 0.07;

        double doubledTuition = initialTuition * 2;
        int years = 0;

        while (initialTuition * Math.pow(1 + annualIncrease, years) < doubledTuition) {
            years++;
        }


        double finalTuition = initialTuition * Math.pow(1 + annualIncrease, years);

        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.println("Tuition will be $" + finalTuition + " in " + years + " years");
    }
}
