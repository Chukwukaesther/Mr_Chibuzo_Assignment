public class HighestNumber{
 public static void main(String... args){



	int[] digit = {4,6,9,7,5,2};

	int highest = digit[0];
 for(int count = 1; count < digit.length; count++){

  if(digit[count] > highest){

	highest = digit[count];
  }
  }

   System.out.print("The highest number is: " + highest); 
  }


}



