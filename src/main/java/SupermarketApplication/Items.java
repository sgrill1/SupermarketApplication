package SupermarketApplication;


public class Items {

    private Integer quantity;
    private Item item;
    private double multipleItemsCost;
    Formatter formatter = new Formatter();

    public Items(Integer selectQuantity, Item item) {
        if (selectQuantity > 0){
            this.quantity = selectQuantity;}
        else this.quantity = 1;
        this.item = item;
        this.multipleItemsCost = formatter.roundToTwoDecimalPlaces(item.getUnitCost() * quantity);
    }


    //Getters

    public Item getItem(){
        return item;
    }

    public String getItemName() {
        return item.getItemName();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getMultipleItemsCost() {
        return multipleItemsCost;
    }

    // Setters

    public int increaseQuantity(int increaseBy){
        if (increaseBy >= 0){
            quantity = getQuantity() + increaseBy;
        }
        else decreaseQuantity(-1*increaseBy);
        return quantity;
    }

    public int decreaseQuantity(int decreaseBy){
        if (decreaseBy > 0 && decreaseBy < quantity){
            quantity = quantity - decreaseBy;
        }
        else if(decreaseBy > 0 && decreaseBy > quantity){
            quantity = 0;
        }
        else increaseQuantity(-1*decreaseBy);
        return quantity;
    }

}
