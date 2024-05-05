import java.util Scanner;
public Class CollectingStudentDetails {
public static void main(String[] args) {


int[] number = new int[]{2,4,5,1,6};
int sum = 0;

for(int count = 0; count < number.length; count++){
sum += number[count];
}
System.out.print(sum);
}
}