 import java.util.Scanner;
  public class MultiplicationCount {
  public static void main(String[] args){
  Scanner keyboardInput = new Scanner(System.in);

System.out.print("Enter number");
int number = keyboardInput.nextInt();
 int count = 0;

for(count = 1 ; count < 12; count++){
System.out.print(count);
count = count + 2;

  }
 }
}