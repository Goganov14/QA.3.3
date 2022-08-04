public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum1 = service.calculate(1000000, 12, 9.99);
        System.out.println(sum1);

        double sum2 = service.calculate(1000000, 24, 9.99);
        System.out.println(sum2);

        double sum3 = service.calculate(1000000, 36, 9.99);
        System.out.println(sum3);
    }
}
