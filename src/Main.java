public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int remainder = 1000000; // сумма кредита
        double interest = 0.01; // написал 0.01 вручную. потому что по формуле 9.99 / (100 * 9.99) у меня получается 0
        int term = 12; // кол-во месяцев 12
        int term1 = 24; // кол-во месяцев 24
        int term2 = 36; // кол-во месяцев 36
        int otvet = service.calculate(remainder, interest, term);
        int otvet1 = service.calculate(remainder, interest, term1);
        int otvet2 = service.calculate(remainder, interest, term2);
        System.out.println("Средний платёж на 12 месяцев:" +otvet+"(рублей)");
        System.out.println("Средний платёж на 24 месяцев:" +otvet1+"(рублей)");
        System.out.println("Средний платёж на 36 месяцев:" +otvet2+"(рублей)");

    }
}