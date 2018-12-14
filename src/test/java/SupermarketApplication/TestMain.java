package SupermarketApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMain {

    Item apple = new Item("apple",0.50,"bogof");
    Items apples = new Items(5, apple);

    //Test Items class

    @Test

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




}

