package SupermarketApplication;

public class Checkout {

    private Cart cart;
    private double beforeDiscountTotal;
    private double afterDiscountTotal;


    public Checkout(Cart cart, double beforeDiscountTotal) {
        this.cart = cart;
        this.beforeDiscountTotal = cart.getCartTotalValue();
    }


}
