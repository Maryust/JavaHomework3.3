public class CreditPaymentService {
    public long calculate(int creditTerm, int creditSum) {
        double percent = 9.99;
        double numberOfPayments = creditTerm * 12;
        double monthPercent = percent / 12 / 100;
        double auxiliaryVariable = Math.pow((1 + monthPercent), numberOfPayments);
        double coefficient = (monthPercent * auxiliaryVariable) / (auxiliaryVariable - 1);
        //double coefficient = monthPercent+(monthPercent / (auxiliaryVariable - 1));
        double monthlyPayment = coefficient * creditSum;
        return (int) monthlyPayment;
    }
}
