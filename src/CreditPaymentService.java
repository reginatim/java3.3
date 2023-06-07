public class CreditPaymentService {
    public int calculate(int sumCredit, double percent, int term) {
        double percentMonth = percent / 1200;
        double coefficient = percentMonth * Math.pow((1 + percentMonth), term) / (Math.pow((1 + percentMonth), term) - 1);
        return (int) Math.round((double) coefficient * sumCredit);
    }
}
