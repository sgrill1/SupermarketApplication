package SupermarketApplication;

public class Checkout {

    private Cart cart;
    private double beforeDiscountTotal;
    private double afterDiscountTotal;
    Formatter formatter = new Formatter();


    public Checkout(Cart cart, double beforeDiscountTotal) {
        this.cart = cart;
        this.beforeDiscountTotal = cart.getCartTotalValue();
    }

    public double Checkout(String discountType){
        afterDiscountTotal = beforeDiscountTotal;

        if (discountType.equals("buyOneGetOneFree")){
        }
        else if (discountType.equals("buyTwoGetAThirdFree")){
        }
        else if (discountType.equals("chooseThreeItemsAndGetTheCheapestOneFree")){
        }
        else if (discountType.equals("applyDiscountVoucher"));

        else

            return afterDiscountTotal;
    }

    public double applyBuyOneGetOneFree(){
        for (Items items: cart.getCart()) {
            if (items.getQuantity() % 2 == 0 && items.getItem().getDiscountType().equals("bogof")){
                items.setMultipleItemsCost(items.getMultipleItemsCost() / 2);
            }
            else if (items.getQuantity() % 2 == 0.5 && items.getItem().getDiscountType().equals("bogof")){
                items.setMultipleItemsCost(items.getMultipleItemsCost();
            }

        }

    }



}
