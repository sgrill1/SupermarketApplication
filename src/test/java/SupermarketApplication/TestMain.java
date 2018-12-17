package SupermarketApplication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMain {

    Item apple = null;
    Items apples = null;

    @BeforeClass
    public void setup() {
            try {
                apple = new Item("apple", 0.50, "bogof"); }
            catch (InvalidPriceException e) {
                e.printStackTrace();
            }
            new Items(5, apple);
    }

    //Test Item class

    @Test
    public void checkItemUnitCostIsRoundedCorrectly() throws InvalidPriceException{
        Item newItem = new Item("newItem",223.5372,"any");
        Assert.assertEquals(newItem.getUnitCost(),223.54,0.001);
    }

    @Test(expected = InvalidPriceException.class)
    public void createItemWithInvalidPrice() throws InvalidPriceException{
        Item newItem = new Item("newItem", -0.01,"any");
    }

    //Test Items class

    @Test
    public void createItemsObjectWithNegativeQuantity() throws InvalidPriceException {
        Item anyItem = new Item("the item",2.00, "null");
        Items anyItems = new Items(-2,anyItem);
        Assert.assertEquals(anyItems.getQuantity(),(Integer) 1);
    }

    @Test
    public void checkIncreaseItemQuantity(){
        apples.increaseQuantity(7);
        Assert.assertEquals(apples.getQuantity(), (Integer) 12);
    }

    @Test
    public void checkNegativeIncreaseAmount(){
        apples.increaseQuantity(-3);
        Assert.assertEquals(apples.getQuantity(), (Integer) 2);
    }

    @Test
    public void checkDecreaseItemQuantity(){
        apples.decreaseQuantity(4);
        Assert.assertEquals(apples.getQuantity(),(Integer) 1);
    }

    @Test
    public void checkNegativeDecreaseAmount(){
        apples.decreaseQuantity(-3);
        Assert.assertEquals(apples.getQuantity(),(Integer) 8);
    }

    @Test
    public void reduceQuantityToLessThanZero(){
        apples.decreaseQuantity(7);
        Assert.assertEquals(apples.getQuantity(),(Integer) 0);
    }

    // Cart Tests






}

