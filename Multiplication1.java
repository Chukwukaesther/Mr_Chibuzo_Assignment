public class Multiplication1 {
	public static void main(String... args){
		System.out.println("=".repeat(200));
                System.out.println("Multiplication Table");
		System.out.println("=".repeat(200));
		
		
		for(int count = 1; count <= 12; count++){
			for(int counter = 1; counter <= 12; counter++){
                	System.out.printf("%2d * %2d = %2d  \t",counter,count, (count * counter));
			}
	    	System.out.println(" ");
		}
               System.out.println("=".repeat(200));
	       System.out.println("Thanks for reading");
               System.out.println("=".repeat(200));
		
		
   	}
}


        
	
