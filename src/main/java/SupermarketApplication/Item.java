package SupermarketApplication;

public class Item{
    private String itemName;
    private double unitCost;
    private String discountType;
    private Formatter formatter = new Formatter();


    public Item(String itemName, double unitCost, String discountType) {
        this.itemName = itemName;
        this.unitCost = formatter.roundToTwoDecimalPlaces(unitCost);
        this.discountType = discountType;
    }

    public String getItemName() {
        return itemName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public String getDiscountType(){
        return discountType;
    }




}
