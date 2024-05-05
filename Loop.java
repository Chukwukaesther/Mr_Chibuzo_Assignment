import java.util.Scanner;
 public class Loop{
 public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int milesPerGallon = 0;
	int milesCombined = 0;

	int count = 1; 
    while(count < 3){
    System.out.print("Enter miles driven: ");
	int milesDriven = input.nextInt();

    System.out.print("Enter gallon used: ");
	int gallonUsed = input.nextInt();

	milesPerGallon = milesDriven / gallonUsed;
    System.out.println("The miles per gallon used is: " +milesPerGallon);

         milesCombined += milesPerGallon;
    
        count++;
    }
	System.out.println("The miles combined is: " + milesCombined);

 }
}




