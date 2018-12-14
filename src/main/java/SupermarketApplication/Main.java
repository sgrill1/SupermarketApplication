package SupermarketApplication;


public class Main {
        public static void main(String[] args) {
                Item apple = new Item("apple", 0.855, "bogof");
                Items apples = new Items(9, apple);

                Cart cart = new Cart(apples);

                Item banana = new Item("banana", 0.67, "three for two");
                Items bananas = new Items(7, banana);


                cart.addNewItemsToCart(bananas);
                cart.printCartItems();

                Checkout checkout = new Checkout(cart, cart.getCartTotalValue());

        }
}
