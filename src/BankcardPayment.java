public class BankcardPayment implements Payment{
    private static final double bankCardFeePercentage = 5.0;

    @Override
    public double calculateTransactionFee(double amount) {
        return amount * (bankCardFeePercentage / 100.0);
    }
}