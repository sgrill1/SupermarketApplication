package SupermarketApplication;


public class Main {
        public static void main(String[] args) {
                Item apple = new Item("apple", 0.855, true,"bogof");
                Items apples = new Items(9, apple);

                Item banana = new Item("banana", 0.67, false,"three for two");
                Items bananas = new Items(7, banana);

                Cart cart = new Cart();

                cart.addItemsToCart(apples);
                cart.addItemsToCart(bananas);
                cart.printCartItems();

                Checkout checkout = new Checkout(cart, cart.getCartTotalValue());
                System.out.println(cart.getCartTotalValue());
                checkout.applyBuyTwoGetAThirdFree();
                System.out.println(checkout.getAfterDiscountTotal());

        }
}
