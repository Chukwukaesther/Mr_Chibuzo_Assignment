import java.util.Scanner;
 public class CollectingStudentDetails{
  public static void main(String... args){
  Scanner scanner = new Scanner(System.in);

String[] names = new String[5];
int[] grades = new int[5];

for(int count = 0; count < 5; count++){
System.out.print("Enter name: ");
String name;
name = scanner.next();

scanner.nextLine();

names[count] = name;

System.out.print("Enter grade: ");
int grade;
grade = scanner.nextInt();
grades[count] = grade;

}
for(int counter = 0; counter < 5; counter++){
System.out.println(names[counter]);
System.out.println(grades[counter]);
}
}
}
  