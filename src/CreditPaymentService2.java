public class CreditPaymentService2 {
    public int calculate(int remainder, double interest, int term2) {
        int result = (int) (remainder * (interest / (1 - Math.pow((1 + interest), -term2))));
        return result;
    }
}
