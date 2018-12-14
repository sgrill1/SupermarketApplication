package SupermarketApplication;

import java.util.HashSet;
import java.util.Set;

public class Cart {

    private Set<Items> cart = new HashSet<>();
    private double cartTotalValue;

    public Cart(Items items) {
        cart.add(items);
    }


    public void addNewItemsToCart(Items items){
        if (cart.contains(items)){
            System.out.println("You already have" + items.getQuantity() + items.getItemName()+ "'s");
        }
        else cart.add(items);
    }


    public void printCartItems(){
        for (Items items: cart){
            System.out.println(items.getQuantity().toString() +" "+ items.getItemName() + "'s");
        }
    }

    public double getCartTotalValue(){
        cartTotalValue = 0.00;
        for (Items items: cart) {
            double value = items.getMultipleItemsCost();
            cartTotalValue = cartTotalValue + value;
        }
        return cartTotalValue;
    }

    public Set<Items> getCart() {
        return cart;
    }
}
