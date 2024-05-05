import java.util.Scanner;
	public class OnesAndZeros {
		public static int[] oddNumbers(int[] numbers){
		
		int[] number = new int[numbers.length];



	for(int count = 0; count < numbers.length; count++){
	if(numbers[count] % 2 == 0){
		numbers[count] = 0;
	}else if(numbers[count] % 2 != 0){
		numbers[count] = 1;
	}
	}
	return numbers;
	
}
}



	








		

	
