public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int remainder = 1000000; // сумма кредита
        double interest = 0.01; // написал 0.01 вручную. потому что по формуле 9.99 / (100 * 9.99) у меня получается 0
        int term = 12; // кол-во месяцев 12
        int term1 = 24; // кол-во месяцев 24
        int term2 = 36; // кол-во месяцев 36
        int answer = service.calculate(remainder, interest, term); // answer = ответ для 12 месяцев
        int answer1 = service.calculate(remainder, interest, term1); // answer1 = ответ для 24 месяцев
        int answer2 = service.calculate(remainder, interest, term2); // answer1 = ответ для 36 месяцев
        // P.S. Я написал решение для каждого срока отдельно, чтобы потом вывести ответ для всех отдельно.
        System.out.println("Средний платёж на 12 месяцев:" +answer+"(рублей)");
        System.out.println("Средний платёж на 24 месяцев:" +answer1+"(рублей)");
        System.out.println("Средний платёж на 36 месяцев:" +answer2+"(рублей)");

    }
}