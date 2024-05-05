import java.util.Scanner;
public class NokiaPhone{
	public  static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Slection menu \n" + "1-> BOOK PNHONE \n");
	int phonebook = input.nextInt();

	switch(phonebook ){
		case 1: 
			System.out.println("Phone book");
			int list = input.nextInt();
			switch(list) {				
				case 1:
					System.out.println("Search");		
					break;
				case 2:
					System.out.println("Service Nos");
					break;
				case 3:
					System.out.println("Add name");
					break;
				case 4:
					System.out.println("Erase");
					break;
				case 5: 
					System.out.println("Edit");
					break;
				case 6: 
					System.out.println("Assign tone");
					break;
				case 7:
					System.out.println("Send b' card");
					break;
				case 8:
		 			System.out.println("Option");
					int options = input.nextInt();
					switch(options){
						case 1:
							System.out.println("Type of view");
							break;
						case 2:
							System.out.println("Memory status");
							break;			
					}
					break;
					
				case 9:
					System.out.println("Speed dials");
					break;
				case 10:
					System.out.println("Voice tags");
					break;
				
		case 2:	
		    System.out.println("Messgaes");
			int listOfMe = input.nextInt();
			    switch(listOfMe ){			
				    case 1:
					    System.out.println("Write messages");
					    break;
				    case 2:
					    System.out.println("Inbox");
					    break;
				    case 3:
					    System.out.println("Outbox");
					    break;
				    case 4:
					    System.out.println("Picture messages");
					    break;
				    case 5:
					    System.out.println("Templates");
					    break;
				    case 6:
					    System.out.println("Smileys");
					    break;
					}
			    break;	

			case 7: 
					System.out.println("Messages settings");
					int meassages = input.nextInt();
					switch(meassages ){
				case 1:
					System.out.println("Message center number");
					break;
				case 2:
					System.out.println("Message sent as");
					break;
				case 3:
					System.out.println("Message validity");
					break;
				case 4:
					System.out.println("Delivery reports");
					break;
				case 5:
					System.out.println("Reply via same centre");
					break;
				case 6:
					System.out.println("Character support");
					break;
					}
			break;

		case 3: 
			System.out.println("Chat");
			break;
				
		case 4: 
			System.out.println("Call register");
			int call = input.nextInt();
			switch(call){
				case 1:
					System.out.println("Missed calls");
					break;
				case 2:
					System.out.println("Received call");
					break;
				case 3:
					System.out.println("Dialled numbers");
					break;
				case 4:
					System.out.println("Erase recent call lists");
					break;
				case 5:
					System.out.println("Show call duration");
					break;
				case 6:
					System.out.println("Last call duration");
					break;
				case 7:
					System.out.println("All calls' duration");
					break;
				case 8:
					System.out.println("Received calls' duration");
					break;
				case 9:
					System.out.println("Dialled calls duration");
					break;
				case 10:
					System.out.println ("Clear times");
					break;
					}	
			break;

		case 5: System.out.println("Tones");
			System.out.println("Call register");
			int tones = input.nextInt();
			switch(tones ){					
				case 1:
					System.out.println("Ringing tone");
					break;
				case 2:
					System.out.println("Ringing volume");
					break;
				case 3:
					System.out.println("Incoming call alert");
					break;
				case 4:
					System.out.println("Composer");
					break;
				case 5:
					System.out.println("Meassage tones");
					break;
				case 6:
					System.out.println("Keypad tones ");
					break;
				case 7:
					System.out.println("Warning and game tones");
					break;
				case 8:
					System.out.println("Vibrating alert");
					break;
				case 9:
					System.out.println("Screen saver");
					break;
				}
			break;
			
		case 6:
			System.out.println("Call settings");
			
				System.out.println("Call settings");
				int callSettings = input.nextInt();
				switch(callSettings ){	
				case 1:
					System.out.println("Automatic redial");
					break;
				case 2:
					System.out.println("Speed dialling");
					break;
				case 3:
					System.out.println("Call waiting options");
					break;
				case 4:
					System.out.println("Own number sending");
					break;
				case 5:
					System.out.println("Phone line in use");
					break;
				case  6:
					System.out.println("Automatic answar");
					break;
				}
			break;
		case 2: 
			System.out.println("Phone Setting");
				int setting = input.nextInt();
				switch(setting){
					case 1:
						System.out.println("Language");
						break;
					case 2:
						System.out.println("Cell info display");
						break;
					case 3:
						System.out.println("Welcome note");
						break;
					case 4:
						System.out.println("Network selection");
						break;
					case 5:
						System.out.println("Lights");
						break;
					case 6:
						System.out.println("Confirm SIM service actions");
					break;
				    }
                    break;

                case 3:
			          System.out.println("Security Settings");
					    int security = input.nextInt();
					switch(security){	
						case 1:
							System.out.println("Pin code request");
							break;
						case 2:
							System.out.println("Call barring service");
							break;
						case 3:
							System.out.println("Fixed dialling");
							break;
					case 4:
						System.out.println("Closed user group");
						break;
					case 5:
						System.out.println("Phone security");
						break;
					case 6:
						System.out.println("Change access codes");
						break;
					case 7: 
						 System.out.println(" Call divert");
						break;
					}		
				               break;
		 
		        case 8: 
			     System.out.println("Games");
			        break;
		        case 9: 
			        System.out.println("Calculator");
			        break;
		        case 10: 
			        System.out.println("Reminders");
			        break;
		        case 11: 
			        System.out.println("Clock");
				    int clock = input.nextInt();
				    switch(clock ){	
				    case 1:
					    System.out.println("Alarm");
					    break;
				    case 2:
					    System.out.println("Clock settings");
					    break;
				    case 3:
					    System.out.println("Date setting");
					    break;
				    case 4:
					    System.out.println("Stopwatch");
					    break;
				    case 5:
					    System.out.println("Countdown timer");
					    break;
				    case 6:
					    System.out.println("Auto update of date and time");
					    break;
				}
			break;
		case 12: 
			System.out.println("Profiles");
			break;
		case 13: 
			System.out.println("SIM services");
			break;
		default:
			System.out.println("invalid input");
			break;		
		}
	 }
    }
}
