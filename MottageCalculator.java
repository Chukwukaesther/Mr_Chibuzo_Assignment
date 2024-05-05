import java.util.Scanner;
   public class  MottageCalculator {
    public static void main(String[] args){

     Scanner input = new Scanner(System.in);

      System.out.println("Enter principal amount :");
      double principal = input.nextInt();

      System.out.println("Enter anual interest rate :");
      double annualRate = input.nextInt();

      System.out.println("Enter duration in a year :");
      double durationInyear = input.nextInt();
     
      double monthYear = durationInyear * 12;

      double rate = annualRate / 100;

      double rate2 = principal * rate / 12;

      double numberOne = rate / 12;

      double numberTwo = 1 + numberOne;
   
      double numberThree = Math.pow(numberTwo,monthYear);

      double numberFive = numberThree - 1;

      double numberSix = rate2 * numberThree;

      double monthlypayment = numberSix /numberFive;

      System.out.printf("Monthly payment is %.2f", monthlypayment);
      }
     }








