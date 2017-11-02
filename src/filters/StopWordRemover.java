package filters;

import java.util.List;

public class StopWordRemover {
	
	List<String> stopWords;
	
	public StopWordRemover(String textFile) { 
		stopWords = Reader.read(textFile);
	}
	
	public void removeStopWordsPushWordCounter(List<String> words) {
		for (String word : words) {
			if (stopWords.contains(word)) {
				words.remove(word);
			}
		}
		WordCounter.countWordsPushPrint(words);
	}
}
