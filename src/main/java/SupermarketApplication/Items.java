package SupermarketApplication;


public class Items {

    private Integer quantity;
    private Item item;
    private double multipleItemsCost;

    public Items(Integer selectQuantity, Item item) {
        this.quantity = selectQuantity;
        this.item = item;
        this.multipleItemsCost = item.getUnitCost() * quantity;
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

}
