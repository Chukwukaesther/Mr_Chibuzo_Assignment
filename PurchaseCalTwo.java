import java.util.Scanner;

public class PurchaseCalTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to E-Store:");
        System.out.print("Please enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Please enter the number of items purchased: ");

        int numberOfItemsPurchased = scanner.nextInt();
        
        int totalCost = 0;
        int itemNum = 1;

        while(itemNum <= numberOfItemsPurchased) {
            System.out.print("Please enter cost for item " + itemNum + ": ");
            int itemCost = scanner.nextInt();
            totalCost += itemCost;
            itemNum++;
        }
        
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Original cost: " + totalCost);
          
        if(totalCost >= 200) {

	System.out.print("Please enter applied discount: ");
        int appliedDiscount = scanner.nextInt();

            int discount = totalCost * appliedDiscount / 100;
            totalCost -= discount;
            System.out.println("Discounted cost: " + discount);
        } else {
            System.out.println("Discounted cost: 0 (no discount)");
        }
        
        System.out.println("Thanks for your patronage!");
    }
}
