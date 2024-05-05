import java.util.Arrays;
	public class DigitMultiplication {
public static void main(String... args){

int[] digit = {6,6,1,2,3};
int maximum = 0;
int sum = 0;

for(int count = 0; count < digit.length; count++){
   for(int counter = 0; counter < digit.length; counter++){
	if(digit[count] < digit[counter]){
	
	sum = digit[count] * digit[counter];
	
	if (sum > maximum){
	maximum = sum;
	}
		}

 

}
}
System.out.print(maximum);
}
}




