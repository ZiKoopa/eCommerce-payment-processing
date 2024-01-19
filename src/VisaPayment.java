public class VisaPayment implements Payment{
    private static final double visaFeePercentage = 2.0;

    @Override
    public double calculateTransactionFee(double amount) {

        return amount * (visaFeePercentage / 100.0);
    }
}
