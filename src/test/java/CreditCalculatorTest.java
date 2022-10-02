import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {

    @Test
    @DisplayName("Тест Рассчета переплаты за весь период")
    public void testCalculationAllPayment() {
        CreditCalculator testCreditCalculator = new CreditCalculator(120000, 12, 12);
        double resultTotalAmountCalculation =
                testCreditCalculator.calculationOfOverpayment();
        Assertions.assertEquals(resultTotalAmountCalculation, (double) 14400);
    }

    @Test
    @DisplayName("Тест Рассчета месячного платежа")
    public void testCalculationMonthPayment() {
        CreditCalculator testCreditCalculator = new CreditCalculator(120000, 12, 12);
        double resultMonthlyPaymentCalculation =
                testCreditCalculator.monthlyPaymentCalculation();
        Assertions.assertEquals(resultMonthlyPaymentCalculation, (double) 11200);
    }
    @Test
    @DisplayName("Тест Рассчета общей суммы к возврату в банк")
    public void testTotalAmountSumCalculation() {
        CreditCalculator testCreditCalculator = new CreditCalculator(120000, 12, 12);
        double resultTotalAmountCalculation =
                testCreditCalculator.totalAmountCalculation();
        Assertions.assertEquals(resultTotalAmountCalculation, (double) 134400);
    }
}

