import java.util.ArrayList;

public class ShirtOrder{
        private final String fullName;
        private final String shirtSize;
        private final Boolean withDesign;
        private final Boolean withHoodie;
        private final String payment;

        public static final ArrayList<ShirtOrder> customerOrders = new ArrayList<>();

        public ShirtOrder(String fullName, String shirtSize, Boolean withDesign, Boolean withHoodie, String payment) {
            this.fullName = fullName;
            this.shirtSize = shirtSize;
            this.withDesign = withDesign;
            this.withHoodie = withHoodie;
            this.payment = payment;
        }

        public Boolean hasDesign() {
            return withDesign;
        }

        public Boolean hasHoodie() {
            return withHoodie;
        }

        public String getPayment() {
            return payment;
        }

        public String getShirtSize() {
            return shirtSize;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "fullName='" + fullName + '\'' +
                    ", shirtSize='" + shirtSize + '\'' +
                    ", withDesign=" + withDesign +
                    ", withHoodie=" + withHoodie +
                    ", payment='" + payment + '\'' +
                    '}';
        }
}
