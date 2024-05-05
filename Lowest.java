public class Lowest {
 public static void main(String... args){





	int[] numbers = {11,2,1,0,-5,6,17,34,-89};

	int lowest = numbers[0];

	for(int count = 0; count < numbers.length; count++){

	if(numbers[count] < lowest){
	     lowest = numbers[count];
	}
	}
	System.out.print(lowest);
	}
}

            