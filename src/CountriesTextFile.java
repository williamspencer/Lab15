import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFile {
	
	public static void writeToFile() {
		Scanner scan1 = new Scanner(System.in);
		Path productsPath = Paths.get("countries.txt");
		File productsFile = productsPath.toFile();
		
		try {
			FileWriter out = new FileWriter(productsFile,true);
			System.out.print("Enter a country: ");
			String input = scan1.nextLine();
			out.append(input + "\n");
			System.out.println("This country has been saved!\n");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		Path productsPath = Paths.get("countries.txt");
		File productsFile = productsPath.toFile();
		try {
			FileReader r = new FileReader(productsFile);
			BufferedReader in = new BufferedReader(r);
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
