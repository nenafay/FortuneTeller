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
		System.out.println("To proceed, please enter your favorite ROYGBIV color.");
		String roygbivColor = input.nextLine();
		System.out.println("We also need to know how many siblings you have. \n Please enter that number below.");
		int numberSibs = input.nextInt();
		
		boolean evenAge = true;
		evenAge = (age%2==0);
		if (evenAge = true) {
			int yrsToRetire = 25;
		} else {int yrsToRetire = 40;
		}
		
		if (numberSibs == 0); {
			String vacaPlace = "Lake Champlain";	
		} if (numberSibs == 1); {
			String vacaPlace = "Bormes-les-Mimosas, France";
		} if (numberSibs == 2); {
			String vacaPlace = "Chillicothe, OH";
		} if (numberSibs == 3); {
			String vacaPlace = "Johanesburg, South Africa";
		} if (numberSibs > 3); {
			String vacaPlace = "Vienna, Austria";
		} if (numberSibs < 0); {
			String vacaPlace  = "that floating garbage patch in the middle of the Pacific";
		}
		
		
		}
		
				

	}

}
