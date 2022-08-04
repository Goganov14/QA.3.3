public class CreditPaymentService {
    public double calculate(double amount, double month, double percent) {
        double percentMonth = percent / (100 * 12);
        double creditPayment = amount * (percentMonth / (1 - Math.pow((1 + percentMonth), -month)));

        double result = Math.round(creditPayment);
        return result;

    }
}
