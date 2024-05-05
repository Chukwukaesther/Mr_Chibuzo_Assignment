import java.util.Arrays;
import java.util.Scanner;
public class AddSumNumber{
public static void main(String[] args) {


int[] number = new int[]{2,4,5,1,6};
int sum = 0;
int numberOne = 0;

for(int count = 0; count < number.length; count++){
sum += number[count];
}
System.out.println(sum);

int[] digit = new int[number.length];

for(int counter = 0; counter < number.length; counter++){
digit[counter] = sum - number[counter];
}

System.out.println(Arrays.toString(digit));

}
}