public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sumCredit = 1_000_000; //сумма кредита
        double percent = 9.99; // процунтная ставка в год
        int term = 36;    //срок кредита, мес

        int payment = service.calculate(sumCredit, percent, term);
        System.out.println(payment);
    }
}