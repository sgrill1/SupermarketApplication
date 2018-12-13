package SupermarketApplication;


public class Main
{
    public static void main( String[] args ) {
        Item apple = new Item("apple",0.855,true);
        Items apples = new Items(8,apple);

        Item banana = new Item("banana",0.67,true);
        Items bananas = new Items(6,banana);

        Cart cart = new Cart();

        cart.addItemsToCart(apples);
        cart.addItemsToCart(bananas);
        cart.printCartItems();
        System.out.println(cart.getCartTotalValue());
        System.out.println(cart.checkCartContainsItems(bananas));





    }
}
