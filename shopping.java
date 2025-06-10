package basicPrograms;

import java.util.*;

public class shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        // To store items and their details
        ArrayList<String> cart = new ArrayList<>();

        System.out.println("Welcome to AOS Supermarket");
        System.out.println("May I know your name?");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", how many items would you be buying today?");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("\nHere is your menu:");
        System.out.println("pizzas for ₹299");
        System.out.println("coke for ₹40");
        System.out.println("burgers for ₹129");
        System.out.println("cereals for ₹465");
        System.out.println("chips for ₹60");
        System.out.println("batteries for ₹240");
        System.out.println("flour for ₹89");
        System.out.println("rice for ₹99");
        System.out.println("toothpaste for ₹120\n");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter item: ");
            String item = sc.nextLine().toLowerCase();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine(); // clear buffer

            int price = 0;
            switch (item) {
                case "pizzas": price = 299; break;
                case "coke": price = 40; break;
                case "burgers": price = 129; break;
                case "cereals": price = 465; break;
                case "chips": price = 60; break;
                case "batteries": price = 240; break;
                case "flour": price = 89; break;
                case "rice": price = 99; break;
                case "toothpaste": price = 120; break;
                default:
                    System.out.println("Invalid item, skipping...\n");
                    continue;
            }

            int itemTotal = price * qty;
            total += itemTotal;
            cart.add(qty + " x " + item + " → ₹" + itemTotal);
            System.out.println("Added to cart.\n");
        }

        System.out.println("\n Final Receipt:");
        System.out.println("name of customer: "+ name);
        for (String entry : cart) {
            System.out.println(entry);
        }
        System.out.println("Total bill: ₹" + total);
        System.out.println("gst = 28 %");
        double gst = 0.28 * total + total ;
        System.out.println("final bill after tax "+ gst);

}
}