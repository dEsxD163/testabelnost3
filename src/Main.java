public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int ostatok = 1000000;
        double procenti = 10/(100*10);
        int period = -12;
        int otvet = service.calculate(ostatok, procenti, period);
        System.out.println(otvet);
    }
}