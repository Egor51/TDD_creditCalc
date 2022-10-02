public class CreditCalculator {

    private float loanAmount;
    private int loanPeriod;
    private float interestRate;

    public CreditCalculator(float loanAmount, int loanPeriod, float interestRate) {
        this.loanAmount = loanAmount;
        this.loanPeriod = loanPeriod;
        this.interestRate = interestRate;
    }


    // метод Рассчет месячного платежа
    public double monthlyPaymentCalculation() {
        double percentMonth = interestRate / 100 / 12; // Ставка в месяц //10/100/12 = 0,008333333333333
        return Math.round((double) ((loanAmount / loanPeriod) + (percentMonth * loanAmount)));
    }

    // метод Рассчет общей суммы к возврату в банк
    public double totalAmountCalculation() {
        return Math.round(monthlyPaymentCalculation() * loanPeriod);
    }

    // метод Рассчет переплаты за весь период
    public double calculationOfOverpayment() {
        return Math.round(totalAmountCalculation() - loanAmount);
    }
}