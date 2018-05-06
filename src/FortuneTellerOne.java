import java.util.Scanner;

public class FortuneTellerOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first and last name.");
		String firstName = input.next();
		String lastName = input.next();

		System.out.println("Hello " + firstName + " " + lastName + "!");

		System.out.println("What is your birth month?");
		String birthMonth = input.next();
		String bees = "";

		if (birthMonth.equals("December" + "January" + "February")) {
			bees = "Cedar Bees";
		}
		if (birthMonth.equals("March" + "April" + "May")) {
			bees = "Honey Bees";
		}
		if (birthMonth.equals("June" + "July" + "August")) {
			bees = "Sweat Bees";
		}
		if (birthMonth.equals("September" + "October" + "November")) {
			bees = "Carpenter Bees";
		}

		System.out.println("What is your age?");
		int userAge = input.nextInt();
		String age = "";

		if (userAge <= 20) {
			age = "an Apple";
		} else if (userAge > 20 && userAge <= 28) {
			age = "Rainbow Eucalyptus";
		} else {
			age = "Bristlecone Pine";
		}

		System.out.println("What is your favorite ROYGBIV color?" + " Enter the word 'help' to get a list of colors.");
		String faveColor = input.next();
		String colors = "";

		if (faveColor.equals("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
		} else if (faveColor.equals("indigo" + "violet" + "blue")) {
			colors = "Johnson's Blue Geranium";
		} else if (faveColor.equals("Green")) {
			colors = "Cushion Spurge";
		} else if (faveColor.equals("Red" + "Orange" + "Yellow")) {
			colors = "Blanket Flower";
		}

		System.out.println("How many siblings do you have?");
		int siblingNumber = input.nextInt();
		String siblings = "";
		
		if (siblingNumber <= 1) {
			siblings = ("8");
		} else if (siblingNumber > 1 && siblingNumber < 4) {
			siblings = ("3");
		} else {
			siblings = ("0");
		}

		System.out.println(firstName + " " + lastName + " your work ethic resembles the " + bees + "!" + " Your tree relative is the " + age +" tree." + " Your ideal flower is the " + colors + "." + " Your greenthumb rating is " + siblings + " out of 10!");
	}

}
