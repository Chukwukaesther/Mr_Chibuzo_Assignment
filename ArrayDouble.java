
public class ArrayDouble {
public static int[] doubleArray(int[] input){


int[] doubleArray = new int[input.length * 2];

for(int count = 0; count < input.length * 2; count++){
doubleArray[count] = input[count];
doubleArray[count + 3] = input[count] * 2;

}
return doubleArray; 
}
}

 
