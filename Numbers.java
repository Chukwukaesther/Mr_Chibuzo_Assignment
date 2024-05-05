import java.util.Arrays;
	public class Numbers {

	
	public static int[] digit(int[] number){

	for(int count = 0; count < number.length; count++){
	for(int counter = 0; counter < number.length; counter++){
	if(number[count] < number[counter]){

	number[count] = number[count] + number[counter];
	number[counter] = number[count] - number[counter];
	number[count] = number[count]- number[counter];
	}
     }
}
return number;
}
}


