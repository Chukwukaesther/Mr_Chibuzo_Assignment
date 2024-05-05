public class SumTask{
	public static void main(String[] args){
		 
         int count = 1;
         int counter = 1;
  	 int multiple = 4;
         int multiple1 = 8;
	 int result = 0;
	 int result2 = 0;
          
          for(int i = 0; i < 5; i++){
            counter = multiple * counter;
            result = result + counter;
             
       }
   	  
	System.out.print(" "+result);

          for(int j = 0; j < 5; j++){
           count = multiple1 * count;
	   result2 = result2 + count;
       
          }

		 System.out.print(" "+result2);
     }
}
