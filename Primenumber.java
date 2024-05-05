public class PrimeNumber{
public static boolean isPrimeNumber(int number){
  int counter = 0;
  int count = 1;
 for(count = 1; count <= number; count++){
  if(number % count == 0) counter++;
  }
 if(counter == 2) return true;

    else return false;
}
   System.out.println(isPrimeNumber(11));
 }
}
