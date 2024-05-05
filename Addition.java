import java.util.Scanner;
  public class Addition{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int product = 0;
	int smallest = 1;
        int largest = 1;
	System.out.print("Enter number: ");
         int number1 = input.nextInt();

	System.out.print("Enter number: ");
         int number2 = input.nextInt();

	System.out.print("Enter number: ");
         int number3 = input.nextInt();

	sum = number1 + number2 + number3;
	System.out.println("The sum of number is" + sum);

        average = sum / 3;
        System.out.println("The average of number is" + average);
       
        product = number1 * number2 * number3;
        System.out.println("This is the product: " + product);

       if(number1 < number2 {
           smallest = number1;
	}else{
	   smallest < number3;
	System.out.println("This is the smallest: " +smallest);
        }

 	 if(number1 > number2 {
           largest = number1;
	}else{
	   largest > number3;
	System.out.println("This is the largest: " + largest);
        }



 

}

}

