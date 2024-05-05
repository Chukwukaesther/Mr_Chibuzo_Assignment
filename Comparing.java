import java.util.Scanner;
 public class Comparing {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

System.out.print("Enter number: ")
int number = input.nextint();

int SquaredNumber = number * number;

System.out.printf("SqauredNUmber is %d\n", squaredNumber)


if(squaredNumber > 100){
System.out.printf("SqauredNUmber is greater than %d\n", squaredNumber)
}

if(squaredNumber < 100){
System.out.printf("SqauredNUmber is less than %d\n", squaredNumber)
}

if(squaredNumber == 100){
System.out.printf("SqauredNUmber is equal to %d\n", squaredNumber)
}

if(squaredNumber != 100){
System.out.printf("SqauredNUmber is not equal to %d\n", squaredNumber)
}

}
}