public class HighestMinusLowest{
public static void main(String... args){

int[] number = {4,7,2,3,4};
int result = range(number);
System.out.println(result);

}



public static int range(int[] numbessr){

int highest = numbessr[0];
	for(int esther : numbessr){
	if(esther > highest){
		 highest = esther;
	}
	}

int lowest = numbessr[0];	
	for(int oluchi : numbessr){
	if(oluchi < lowest){
		 lowest = oluchi;
	}
	
	}
return highest - lowest;
}


}