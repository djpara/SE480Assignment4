package main;

import filters.Reader;

public class Main {

	/** Test program for demonstrating the Stemmer.  It reads text from a
	 * a list of files, stems each word, and writes the result to standard
	 * output. Note that the word stemmed is expected to be in lower case:
	 * forcing lower case must be done outside the Stemmer class.
	 * Usage: Stemmer file-name file-name ...
	 */
	public static void main(String[] args) {
		Reader reader = new Reader();
		reader.readFilePushNonAlphaRemover("alice30.txt");
	}
}  