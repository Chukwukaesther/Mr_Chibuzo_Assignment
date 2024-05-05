public class FiveMultiples{
	public static void main(String[] args){
		 
         int count = 1;
         int counter = 1;
         int multiple = 4;
         int multiple1 = 8;

          for(int i = 0; i < 5; i++){
            counter = multiple * counter;
            System.out.print(" "+counter);
         
          }
   
          for(int j = 0; j < 5; j++){
           count = multiple1 * count;
           System.out.print(" "+count);
           

        }

   
  }
}