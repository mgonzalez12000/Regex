package regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	/* Write a program that reads a text file to a String and displays the number
	 * of times a regex appears in the text. Use an instance method to read the
	 * file to the String, which should be an instance variable.*/

	private String file; 

	public String read(String fileName) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(fileName));

		while(sc.hasNextLine()) {
			this.file += sc.nextLine() + "\n";
		}
		return this.file;
	}

	//Search for the regex using another instance method that takes the regex as a parameter

	public int regexMatcher(String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(this.file);

		int counter = 0;

		boolean found = false;

		while (matcher.find()) {
			counter += 1;
			found = true;
		}
		if (!found) {
			return 0;
		}
		return counter;
	}
}
