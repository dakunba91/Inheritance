public class StoreOneB extends StoreToRent {
    public StoreOneB(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        super(loanRequired, loanAmount, loanPaymentTerm);
    }

    public void restaurantSpecialFeature() {
        System.out.println("This store is a restaurant with a special dining area.");
    }
}
