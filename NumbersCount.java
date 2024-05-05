import java.util.Scanner;
	public class NumbersCount { 
	public static void main(String... args){
Scanner input = new Scanner(System.in); 

int digit = 0;
System.out.print("Enter numbers: ");

for(int count = 0; count < 11; count++){
int numbers = input.nextInt();

if(digit %  == 10){
digit += digit + numbers;

}
}
System.out.print(digit);

}


}

