	import java.util.Scanner;

public class FortuneTellerOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first and last name.");
		String firstName = input.next();
		String lastName = input.next();

		System.out.println("Hello " + firstName + " " + lastName + "!");

		System.out.println("What is your birth month?");
		int birthMonth = input.nextInt();
		String bees = "";

		if (birthMonth == 12) {
			bees = "Cedar Bee";
		}else if (birthMonth == 1) {
			bees = "Cedar Bee";
		}else if (birthMonth == 2) {
			bees = "Cedar Bee";
		}else if (birthMonth == 3) {
			bees = "Honey Bee";
		}else if (birthMonth == 4) {
			bees = "Honey Bee";
		}else if (birthMonth == 5) {
			bees = "Honey Bee";
		}else if (birthMonth == 6) {
			bees = "Sweat Bee";
		}else if (birthMonth == 7) {
			bees = "Sweat Bee";
		}else if (birthMonth == 8) {
			bees = "Sweat Bee";
		}else if (birthMonth == 9) {
			bees = "Carpenter Bee";
		}else if (birthMonth == 10) {
			bees = "Carpenter Bee";
		}else if (birthMonth == 11) {
			bees = "Carpenter Bee";
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
		{
		if (faveColor.equalsIgnoreCase("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			faveColor = input.next();}
			
		if (faveColor.equalsIgnoreCase("Indigo")) {
			colors = "Johnson's Blue Geranium";
		}else if (faveColor.equalsIgnoreCase("Violet")) {
			colors = "Johnson's Blue Geranium";
		}else if (faveColor.equalsIgnoreCase("Blue")) {
			colors = "Johnson's Blue Geranium";
		}else if (faveColor.equalsIgnoreCase("Green")) {
			colors = "Cushion Spurge";
		}else if (faveColor.equalsIgnoreCase("Red")) {
			colors = "Blanket Flower";
		}else if (faveColor.equalsIgnoreCase("Orange")) {
			colors = "Blanket Flower";
		}else if (faveColor.equalsIgnoreCase("Yellow")) {
			colors = "Blanket Flower";
		}
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


