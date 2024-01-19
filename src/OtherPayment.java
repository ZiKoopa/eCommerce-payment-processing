public class OtherPayment implements Payment{
    private static final double otherPaymentFeePercentage = 10.0;

    @Override
    public double calculateTransactionFee(double amount) {

        return amount * (otherPaymentFeePercentage / 100.0);
    }
}
