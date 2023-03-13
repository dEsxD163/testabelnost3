public class CreditPaymentService {
    public int calculate(int remainder, double interest, int term) {
        int result = (int) (remainder * (interest / (1 - Math.pow((1 + interest), -term))));
        return result;
    }
}
