import java.util.Scanner;
   public class ComparingInteger {
   public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter one number :  ");
int userInput = scanner.nextInt();

int esther = userInput * userInput; 

int king = esther;

System.out.printf("squareNumber is %d\n", king);

  if(king > 100){
System.out.print("squareNumber is greater than 100");
}
 if(king < 100){
System.out.print("squareNumber is less than 100");
}
if(king == 100){
System.out.print("squareNumber is eqaul to 100");

}
     
  }
}

