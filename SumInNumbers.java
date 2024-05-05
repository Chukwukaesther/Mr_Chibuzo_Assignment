import java.util.Scanner;
     public class SumInNumbers{
      public static void main(String...args){
        Scanner input = new Scanner(System.in);
int sum = 0;

System.out.print("How many number do you want to add?: ");
 int prompt = input.nextInt();

for(int i = 0; i < prompt; i++){

System.out.print("Enter number: ");
 int number = input.nextInt();
  sum += number;
}
 System.out.print(sum);
}
}

