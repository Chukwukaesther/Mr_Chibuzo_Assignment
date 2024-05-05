import java.util.Scanner;

public class PurchaseCal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to E-Store:");
        System.out.print("Please enter customer name: ");
        String customerName = scanner.nextLine();
        
        int totalCost = 0;
        int itemNum = 1;

        while(itemNum <= 10) {
            System.out.print("Please enter cost for item " + itemNum + ":");

            int itemCost = scanner.nextInt();

            totalCost += itemCost;
            itemNum++;
        }
        
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Original cost: " + totalCost);
        
        if(totalCost >= 200) {
            int discount = totalCost * 10 / 100;
            totalCost -= discount;
            System.out.println("Discounted cost: " + discount);
        } else {
            System.out.println("Discounted cost: 0 (no discount)");
        }
        
        System.out.println("Thanks for your patronage!");
        
	
        
    }
}
