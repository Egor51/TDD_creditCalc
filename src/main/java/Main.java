public class Main {
    public static void main(String[] args) {
        CreditCalculator creditCalculator = new CreditCalculator(120000,12,12);

        System.out.println(creditCalculator.calculationOfOverpayment());

        System.out.println(creditCalculator.monthlyPaymentCalculation());

        System.out.println(creditCalculator.totalAmountCalculation());
    }
}
