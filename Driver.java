package regex;

import java.io.FileNotFoundException;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException  {
		Regex txtHandler = new Regex();

		txtHandler.read("/Users/marcogonzalez/Desktop/romeojuliet.txt");

		System.out.println(txtHandler.regexMatcher("John"));

		System.out.println(txtHandler.regexMatcher("Jo"));

		System.out.println(txtHandler.regexMatcher("[\n](t|T)he"));

		System.out.println(txtHandler.regexMatcher("[\n][^(t|T)he]"));

		System.out.println(txtHandler.regexMatcher("[\\.]"));

	}
}

