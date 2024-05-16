public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item firstItem = new Item("123", 20);
        Item secondItem = new Item("1234", 50);

        shoppingCart.addItem(firstItem);
        shoppingCart.addItem(secondItem);

        CreditCardStrategy cardStrategy = new CreditCardStrategy("Mr Card", "12345678", "123", "12/25");


        shoppingCart.pay(cardStrategy);
    }
}
