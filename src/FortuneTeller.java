import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		System.out.println("Welcome to the FortuneTeller Digital Medium App!" +
	"\n Let's get started.");
	
		System.out.println("What is your first name?");
	
		Scanner input = new Scanner (System.in);
		String firstName = input.nextLine();
		
		System.out.println("Thanks," + firstName + ", nice to meet you." + "\n" + "What is your last name?");
		String lastName = input.nextLine();
		System.out.println("Great!");
		
		System.out.println("Now, please enter your age as a whole number.");
		int age = input.nextInt();
		System.out.println("It's only a number.");
		
		System.out.println("Next, we need your birth month." + "\n" + "Please enter 1 for January, 2 for February, etc.");
		int birthMonth = input.nextInt();
		System.out.println("Thank you.");
		input.nextLine();
		
		System.out.println("To proceed, we need to know your favorite ROYGBIV color.");
		System.out.println("If the term ROYGBIV confuses you, type \'help\' below.");
		String roygbivColor;
		roygbivColor = input.nextLine();
		while (roygbivColor.toLowerCase().equals("help")){
				System.out.println("ROYGBIV is an acronym standing for the following colors:" 
					+'\n' + '\t'  + "Red"
					+'\n' + '\t'  + "Orange"
					+'\n' + '\t'  + "Yellow"
					+'\n' + '\t'  + "Green"
					+'\n' + '\t'  + "Blue"
					+'\n' + '\t'  + "Indigo"
					+'\n' + '\t'  + "Violet");
				System.out.println("Please input your choice of ROYGBIV color.");
				roygbivColor = input.nextLine();
//				if (roygbivColor != "help") 
//					break;
//				}
			}  
		System.out.println(roygbivColor);
		System.out.println("Thank you.");
			
		System.out.println("We also need to know how many siblings you have. \n Please enter that number below.");
		int numberSibs = input.nextInt();
		int yrsToRetire;
		boolean evenAge = true;
		evenAge = (age%2==0);
		if (evenAge == true) {
			  yrsToRetire = 25;
		} else {yrsToRetire = 40;
		}
		String vacaPlace = null;
		if (numberSibs == 0) {
			 vacaPlace = "Lake Champlain";	
		} else if (numberSibs == 1) {
			 vacaPlace = "Bormes-les-Mimosas, France";
		} else if (numberSibs == 2) {
			 vacaPlace = "Bisbee, AZ";
		} else if (numberSibs == 3) {
			 vacaPlace = "Bali";
		} else if (numberSibs > 3) {
			 vacaPlace = "Teesdale, UK";
		} else if (numberSibs < 0) {
			 vacaPlace  = "that floating garbage patch in the middle of the Pacific";
		}
		long bankBalance;
		if (birthMonth <=4) {
			 bankBalance = 12000;
		} else if (birthMonth >=5 && birthMonth <= 8) {
			 bankBalance = 1000000000;
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			 bankBalance = 999;
		} else  {
			 bankBalance = -1200000;
		}
		
		String modeOfTrans;
		if (roygbivColor.toLowerCase().equals("red")) {
			 modeOfTrans = "Uber.";
		} else if (roygbivColor.toLowerCase().equals("orange")) {
			 modeOfTrans = "whatever new thing Tesla is coming out with.";
		} else if (roygbivColor.toLowerCase().equals("yellow")) {
			 modeOfTrans = "roller skates!";
		} else if (roygbivColor.toLowerCase().equals("green")) {
			 modeOfTrans = "a sleek black limo with an attractive chauffeur.";
		} else if (roygbivColor.toLowerCase().equals("blue")) {
			modeOfTrans = "the bus from the old folks' home.";
		} else if (roygbivColor.toLowerCase().equals("indigo")) {
			modeOfTrans = "flying car";
		} else if (roygbivColor.toLowerCase().equals("violet")) {
			modeOfTrans  = "pogo stick!";
		} else {
			modeOfTrans = "catapault.";
		}		
		System.out.println( firstName + " " + lastName + " will retire in " + yrsToRetire + "years "+ '\n'
		+ " with $" + bankBalance + " in the bank, a vacation home in " + vacaPlace + '\n' 
		+ ", and will travel by " + modeOfTrans);					

	}

}

