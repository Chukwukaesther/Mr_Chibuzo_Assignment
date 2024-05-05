import java.util.Scanner;
public class Prime{
 public static void main(String... args){


 Scanner input = new Scanner(System.in);


System.out.print("Enter a number: ");
int Oluchi = input.nextInt();

boolean user = KataFunctionOne.isPrime(Oluchi);

System.out.println(user);

