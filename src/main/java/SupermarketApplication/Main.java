package SupermarketApplication;


public class Main
{
    public static void main( String[] args ) {
        Item apple = new Item("Apple", 0.53, false);
        Item banana = new Item("Banana",0.98,true);
        Item pear = new Item("Pear", 0.68,true);

        Items apples = new Items(4,apple);
        Items bananas = new Items(5,banana);
        Items pears = new Items(3,pear);

        Cart cart = new Cart();
        cart.addItemsToCart(bananas);
        cart.addItemsToCart(pears);
        cart.addItemsToCart(apples);

        cart.printCartItems();
        System.out.println(cart.getCartTotalValue());

        Checkout checkout = new Checkout(cart);
        System.out.println(checkout.applyPercentageDiscountVoucher(30));

    }
}
