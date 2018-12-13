package SupermarketApplication;

public class Item{
    private String itemName;
    private double unitCost;
    private boolean availableDiscount;
    private String discountType;
    private Formatter formatter = new Formatter();


    public Item(String itemName, double unitCost, boolean availableDiscount, String discountType) {
        this.itemName = itemName;
        this.unitCost = formatter.roundToTwoDecimalPlaces(unitCost);
        this.availableDiscount = availableDiscount;
        this.discountType = discountType;
    }

    public String getItemName() {
        return itemName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public boolean getIsDiscountAvailable() {
        return availableDiscount;
    }

    public String getDiscountType(){
        return discountType;
    }




}
