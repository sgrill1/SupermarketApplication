package SupermarketApplication;

public class Checkout {

    private Cart cart;
    private double beforeDiscountTotal;
    private double afterDiscountTotal;
    private double amountOff;


    Formatter formatter = new Formatter();


    public Checkout(Cart cart, double beforeDiscountTotal) {
        this.cart = cart;
        this.beforeDiscountTotal = cart.getCartTotalValue();
    }

    public void applyDiscount(String discountType){
        afterDiscountTotal = beforeDiscountTotal;

        switch (discountType) {
            case "bogof":
                applyBuyOneGetOneFree();
                break;

            case "three for two":
                applyBuyTwoGetAThirdFree();
                break;

            case "choose three and get the cheapest free":
                break;

            default:
                break;
        }
    }

    public double presentPercentageDiscountVoucher(int percentageOff){
        afterDiscountTotal = cart.getCartTotalValue() - calculateAmountOff(percentageOff);
        return afterDiscountTotal;
    }

    //Discounts

    private double applyBuyOneGetOneFree(){
        for (Items items: cart.getCart()) {
            if (items.getQuantity() % 2 == 0 && items.getItem().getDiscountType().equals("bogof")){
                afterDiscountTotal = beforeDiscountTotal - (items.getMultipleItemsCost() / 2);
            }
            else if (items.getQuantity() % 2 == 0.5 && items.getItem().getDiscountType().equals("bogof")){
                afterDiscountTotal =
                        beforeDiscountTotal - ((items.getQuantity() - 1) * (items.getItem().getUnitCost()/2))
                                + items.getItem().getUnitCost();
            }
        }
        return formatter.roundToTwoDecimalPlaces(afterDiscountTotal);
    }

    private double applyBuyTwoGetAThirdFree(){
        for (Items items: cart.getCart()) {
            if (items.getQuantity() % 3 == 0 && items.getItem().getDiscountType().equals("three for two")){
                afterDiscountTotal = beforeDiscountTotal - (items.getMultipleItemsCost() / 3);
            }
            else if(items.getQuantity() %3 > 0.3 && items.getQuantity() %3 < 0.6 && items.getItem().getDiscountType().equals("three for two")){
                afterDiscountTotal = beforeDiscountTotal
                        - ((items.getQuantity() - 2) * (items.getItem().getUnitCost() * (2/3))) + 2*(items.getItem().getUnitCost());
            }
            else if(items.getQuantity() %3 > 0.6){
                afterDiscountTotal = beforeDiscountTotal
                        - ((items.getQuantity() - 1) * (items.getItem().getUnitCost() * (2/3))) + items.getItem().getUnitCost();
            }
        }
        return afterDiscountTotal;
    }


    //Getters

    public double getAfterDiscountTotal() {
        return formatter.roundToTwoDecimalPlaces(afterDiscountTotal);
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
