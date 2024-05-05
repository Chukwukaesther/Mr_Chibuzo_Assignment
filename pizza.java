import java.util.Scanner;
	public class pizza{
 	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] sapaSize = {4, 2_000};
	int[] smallMoney = {6, 2_400};
	int[] bigBoys = {8, 3_000};
	int[] odogwu = {12, 4_200};


	System.out.println("Enter number of people: ");
		int numberOfPeople = input.nextInt();

	System.out.println("Pizza type: ");
		String pizzaType = input.next();

	
 	if (pizzaType.toLowerCase().equals("sapa")){
		int numberOfBox = numberOfPeople / sapaSize[0];
		int remainder = numberOfPeople % sapaSize[0];
		
		if (remainder > 0){
			numberOfBox += 1;
		}
		
		int numberOfSlice = numberOfBox * sapaSize[0];
		int leftOver = numberOfSlice - numberOfPeople;
		int price = numberOfBox * sapaSize[1];

		System.out.println("Number of boxes of pizza to buy = " + numberOfBox + "boxes");

		System.out.println("Number left over slices after serving = " + leftOver +" slices");

		

		System.out.println("Price = "  + price);

		
		
	} else if (pizzaType.toLowerCase().equals("smallmoney")){
		int numberOfBox = numberOfPeople / smallMoney[0];
		int remainder = numberOfPeople % smallMoney[0];
		
		if (remainder > 0){
			numberOfBox += 1;
		}
		
		int numberOfSlice = numberOfBox * smallMoney[0];
		int leftOver = numberOfSlice - numberOfPeople;
		int price = numberOfBox * smallMoney[1];

		System.out.println("Number of boxes of pizza to buy = " + numberOfBox + "boxes");

		System.out.println("Number left over slices after serving = " + leftOver +" slices");

		

		System.out.println("Price = "  + price);

	} else if (pizzaType.toLowerCase().equals("bigboys")){
		int numberOfBox = numberOfPeople / bigBoys[0];
		int remainder = numberOfPeople % bigBoys[0];
		
		if (remainder > 0){
			numberOfBox += 1;
		}
		
		int numberOfSlice = numberOfBox * bigBoys[0];
		int leftOver = numberOfSlice - numberOfPeople;
		int price = numberOfBox * bigBoys[1];

		System.out.println("Number of boxes of pizza to buy = " + numberOfBox + "boxes");

		System.out.println("Number left over slices after serving = " + leftOver +" slices");

		

		System.out.println("Price = "  + price);

		

		

	} else if (pizzaType.toLowerCase().equals("odogwu")){
		int numberOfBox = numberOfPeople / odogwu[0];
		int remainder = numberOfPeople % odogwu[0];
		
		if (remainder > 0){
			numberOfBox += 1;
		}
		
		int numberOfSlice = numberOfBox * odogwu[0];
		int leftOver = numberOfSlice - numberOfPeople;
		int price = numberOfBox * odogwu[1];

		System.out.println("Number of boxes of pizza to buy = " + numberOfBox + "boxes");

		System.out.println("Number left over slices after serving = " + leftOver +" slices");

		

		System.out.println("Price = "  + price);
	
	} else {
		System.out.println("Invalid Pizza type");
	

	

}



}
}


