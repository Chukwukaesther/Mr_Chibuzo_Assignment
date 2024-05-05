public class Max {
 public static void main(String... args){

	int[] numbers = {11,2,13,40,5,6,17,34,};


	int highest = numbers[0];

	for(int i = 0; i < numbers.length; i= i+1) {

	if( numbers[i] > highest ){
 	      highest = numbers[i] ;

	}
	}
	System.out.println(highest);

	}

}
                               