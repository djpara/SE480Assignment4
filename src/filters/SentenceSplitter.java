package filters;

import java.util.ArrayList;
import java.util.List;

public class SentenceSplitter {
	public SentenceSplitter() { }
	
	public static void splitPushStemmer(List<String> sentences) {
		List<String[]> arrayOfWordsArray = new ArrayList<String[]>();
		
		// Creates and array of strings (words) from sentences parameter and adds to array
		for (String sentence : sentences) {
			arrayOfWordsArray.add(sentence.split("\\s"));
		}
		
		Stemmer stemmer = new Stemmer();
		stemmer.prepareToStem(arrayOfWordsArray);
	}
	
	public String[] split(String sentence) {
		return sentence.split("\\s");
	}
}
