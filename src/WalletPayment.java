public class WalletPayment implements Payment{
    @Override
    public double calculateTransactionFee(double amount) {
        return 0.0;
    }
}
