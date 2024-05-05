public class PrimeNumber2{
public static boolean isPrimeNumber(int number){
  int counter = 0;
  int count = 1;
 for(count = 1; count <= number; count++){
  if(number % count == 0) counter++;
  }
 if(counter == 2) return true;

    else return false;

}
public static void main(String...args){
   System.out.println(isPrimeNumber(11));
 }
}
