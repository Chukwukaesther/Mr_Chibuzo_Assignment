import java.util.Scanner;
	public class EvenNumbers {
		public static boolean[] Even(int[] numbers){
		
		boolean[] number = new boolean[numbers.length];



	for(int count = 0; count < numbers.length; count++){
	if(numbers[count] % 2 == 0){
		number[count] = false;
	}else{
		number[count] = true;
	}
	}
	return number;
	
}
}



