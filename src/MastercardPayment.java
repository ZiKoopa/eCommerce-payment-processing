public class MastercardPayment implements Payment{
    private static final double mastercardFeePercentage = 3.0;

    @Override
    public double calculateTransactionFee(double amount) {

        return amount * (mastercardFeePercentage / 100.0);
    }
}
