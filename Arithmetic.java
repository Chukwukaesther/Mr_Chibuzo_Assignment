import java.util.Scanner;
   public class Arithmetic {
   public static void main(String[] args){

Scanner scanner = new Scanner(System.in);



System.out.print("Enter first number: ");
int firstNumber = scanner.nextInt();

System.out.print("Enter second number: ");
int secondNumber = scanner.nextInt();

int squaredNumber1 = firstNumber * firstNumber;
int squaredNumber2  = secondNumber * secondNumber;

int sum = squaredNumber1 + squaredNumber2;

int diff = squaredNumber1 - squaredNumber2;


System.out.println("The square of first number is: "+squaredNumber1);

System.out.println("The square of Second number is: "+squaredNumber2);

System.out.println("The difference of the  number is: "+diff);



 }

}

