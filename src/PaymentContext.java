public class PaymentContext {
    private Payment paymentStrategy;

    public PaymentContext(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double getPaymentFee(double amount) {
        double transactionFee = paymentStrategy.calculateTransactionFee(amount);

        return transactionFee;
    }
}
