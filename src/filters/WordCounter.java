package filters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

	public WordCounter() { }
	
	
	public static void countWordsPushPrint(List<String> words) {
		Map<String, Integer> mappedWords = new HashMap<String, Integer>();
		
		for (String word : words) {
			if (mappedWords.containsKey(word)) {
				mappedWords.put(word, mappedWords.get(word)+1);
			}
			mappedWords.put(word, 1);
		}
		
		Printer.printTopTen(mappedWords);
	}
	
	public Map<String, Integer> mapped(List<String> words) {
		Map<String, Integer> mappedWords = new HashMap<String, Integer>();
		
		for (String word : words) {
			if (mappedWords.containsKey(word)) {
				mappedWords.put(word, mappedWords.get(word)+1);
			}
			mappedWords.put(word, 1);
		}
		
		return mappedWords;
	}
	
}
