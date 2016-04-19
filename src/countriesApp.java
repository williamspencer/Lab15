import java.util.Scanner;

public class countriesApp {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		String input = "";
		System.out.println("Welcome to the Countries Maintenance Application!\n");
		
		do{
			printMenu();
			input = scan1.nextLine();
			optionMenu(input);
					
		} while (!input.equals("3"));
		System.out.println("See you later!... peasant.");
	}

	public static void optionMenu(String input) {
		switch(input){
			case "1":
				System.out.print("\n");
				CountriesTextFile.readFile();
				System.out.print("\n");
				break;
			case "2":
				System.out.print("\n");
				CountriesTextFile.writeToFile();
				break;
			case "3":
				break;
			default :
				System.out.println("Enter a valid option, you peasant.\n");
				break;
		}
	}

	public static void printMenu() {
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
		System.out.print("\nEnter menu number: ");
	}
}
