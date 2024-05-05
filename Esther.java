import java.util.Arrays;
public class Esther { 

public static int[] index(int[] digit){
 int size = 0;

for(int picker = 0; picker <digit.length; picker++){

if(digit[picker]%2 == 0){
	size ++;
}

}

int[] even = new int[size];
int position = 0;


for(int count = 0; count < digit.length; count++){
if(digit[count] % 2  == 0){
even[count] = digit[count];
position++;
}

}


return even;

 }



}
