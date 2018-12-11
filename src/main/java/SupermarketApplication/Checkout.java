package SupermarketApplication;

public class Checkout {

    private Cart cart;
    private double amountOff;
    private double newCartTotalValue;

    public Checkout(Cart cart) {
        this.cart = cart;
    }

    public double applyPercentageDiscountVoucher(int percentageOff){
        newCartTotalValue = cart.getCartTotalValue() - calculateAmountOff(percentageOff);
        return newCartTotalValue;
    }
    //Helpers

    private double calculateAmountOff(int percentage){
        return amountOff = cart.getCartTotalValue() * decimalToPercentage(percentage);
    }

    private double decimalToPercentage(Integer percentage) {
        double decimal = percentage / 100.0;
        return decimal;
    }
}
