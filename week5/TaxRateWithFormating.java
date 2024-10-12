public class TaxRateWithFormating {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("interest is $" + interest);
        System.out.println("interest with two decimal point is %4.2f " + interest);
    }
}
