package SupermarketApplication;

import java.util.HashMap;

public class Item {
    private String itemName;
    private double unitCost;
    private boolean availableDiscount;

    public Item(String itemName, double unitCost, boolean availableDiscount) {
        this.itemName = itemName;
        this.unitCost = unitCost;
        this.availableDiscount = availableDiscount;
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

}
