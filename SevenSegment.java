import java.util.Scanner;
public class sevenSegment{
		public static void main(String... args){
		Scanner input = new Scanner(System.in);

	
	System.out.print("Enter number from o -9: ");
	String number = input.nextLine();

     switch(number){
         case "1111110" -> System.out.print("\n//\n/|");
	            //break

       
	case "0110000" -> System.out.print("\n|\n|");
                     //break
	case "1101101" -> System.out.print("_\n|n/");
                   //break

        case "1111001" -> System.out.print("_\n_|\n_|\n_|");
                 //break

        case "0110011" -> System.out.print("\n|_|\n|");
	           //break

        case "1011011" -> System.out.print("|n/\n_|");
                   //break

        case "1011111" -> System.out.print("|n/\n_|");
	         //break

        case "1110000" -> System.out.print("_\n|\n|");
                  //break

        case "11111111" -> System.out.print("|n/|\n|_|");
                   //break

        case "1110011" ->  System.out.print("|n/|\n_|");
                    //break
       }

   
	
}

}