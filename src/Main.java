public class Main {
    public static void main(String[] args) {
        CreditPaymentService service =new CreditPaymentService();

        System.out.println("Сумма кредита = 1_000_000 рублей" );
        System.out.println("Годовая процентная ставка = 9,99%");
        System.out.println("Срок кредита = 12 месяцев");
        System.out.println("Ежемесячный платеж " + service.calculate( 1_000_000, 9.99, 12));

        System.out.println();
        System.out.println("Сумма кредита = 1_000_000 рублей" );
        System.out.println("Годовая процентная ставка = 9,99%");
        System.out.println("Срок кредита = 24 месяца");
        System.out.println("Ежемесячный платеж " + service.calculate( 1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("Сумма кредита = 1_000_000 рублей" );
        System.out.println("Годовая процентная ставка = 9,99%");
        System.out.println("Срок кредита = 12 месяцев");
        System.out.println("Ежемесячный платеж " + service.calculate( 1_000_000, 9.99, 36));




    }
}
