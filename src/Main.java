public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditForOneYear = (int) service.calculate(1, 1_000_000);
        System.out.println("Ваш ежемесячный платёж составит:" + creditForOneYear);

        int creditForTwoYears = (int) service.calculate(2, 1_000_000);
        System.out.println("Ваш ежемесячный платёж составит:" + creditForTwoYears);

        int creditForThreeYears = (int) service.calculate(3, 1_000_000);
        System.out.println("Ваш ежемесячный платёж составит:" + creditForThreeYears);
    }
}
