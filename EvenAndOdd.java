import java.util.Arrays;
public class EvenAndOdd{
public static void main(String... args){

int[] number = {1,2,3,4,5,6,7,8,9,10};
int[] result = digit(number);
System.out.print(Arrays.toString(result));

}

public static int[] digit(int[] number){

int[] even = new int[number.length/2];
int counter = 0;
for(int count = 0; count < number.length; count+=2){
	even[counter] = number[count];
	counter++;

}
return even;


}
}