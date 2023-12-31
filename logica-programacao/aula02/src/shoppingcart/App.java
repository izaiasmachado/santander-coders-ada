package shoppingcart;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();

        askForItems(cart);
        printTotalPrice(cart);
    }

    public static void askForItem(ShoppingCart cart, String item) {
        System.out.printf("Digite a quantidade de %ss: ", item);
        int quantity = scanner.nextInt();
        cart.addItem(item, quantity);
    }

    public static void askForItems(ShoppingCart cart) {
        String[] items = cart.getPromotionalItems();

        for (String item : items) {
            askForItem(cart, item);
        }
    }

    public static void printTotalPrice(ShoppingCart cart) {
        double totalPrice = cart.getTotalPrice();
        System.out.printf("Preço total da compra: R$ %.2f\n", totalPrice);
    }
}
