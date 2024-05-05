import java.util.Scanner;
   public class TaskOne{
     public static void main(String... args){
     Scanner input = new Scanner(System.in);

  int count = 0;
  int nmumber =1;

 for(count = 0; count <= 10; count++){
   System.out.print("Enter scores: ");
   int number = input.nextInt();
  
  count += number;
   count = count + 1;
 }
		
System.out.print("count");		

 }
}      
