public class CreditPaymentService {

    public int calculate(double loanAmount, double interestRate, double month) {

        double i = interestRate / (12 * 100);
        double j = 1 + i;
        double h = Math.pow(j, month);
        double k = i * h / (h - 1);// к- коэффициент аннуитета
        double monthlyPayment = loanAmount * k; // ежемесячный платеж
        return (int) monthlyPayment;

    }

}
