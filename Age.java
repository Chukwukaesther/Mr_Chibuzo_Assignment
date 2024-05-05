import java.util.Scanner;
 public class Age{
  public static void main(String... args){
  Scanner scanner = new Scanner(System.in);

int[] ages = new int[5];


for(int digit = 0; digit < 5; digit++){
System.out.print("Enter Age: ");
int age;
age = scanner.nextInt();
ages[digit] = age;

}
for(int count = 0; count < 5; count++){
System.out.println(ages[count]);
}
}
}
  