import java.util.Scanner;
 public class Names{
  public static void main(String... args){
  Scanner scanner = new Scanner(System.in);

String[] names = new String[5];



for(int i = 0; i < 5; i++){
System.out.print("Enter name: ");
String name = scanner.nextLine();
names[i] = name;

}
for(int count = 0; count < 5; count++){
System.out.println(names[count]);
}
}
}
  