public class CreditPaymentService {
    public int calculate(int ostatok, double procenti, int period) {
        int result = (int) (ostatok * (procenti / (1 - Math.pow((1 + procenti), period))));
        return result;
    }
}
