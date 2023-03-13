public class CreditPaymentService1 {
    public int calculate(int remainder, double interest, int term1) {
        int result = (int) (remainder * (interest / (1 - Math.pow((1 + interest), -term1))));
        return result;
    }
}
