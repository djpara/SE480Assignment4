package filters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

	public WordCounter() { }
	
	
	public static void printTopTen(List<String> words) {
		
	}
	
	public static Map<String, Integer> mapped(List<String> words) {
		Map<String, Integer> mappedWords = new HashMap<String, Integer>();
		
		for (String word : words) {
			if (mappedWords.containsKey(word)) {
				mappedWords.put(word, mappedWords.get(word)+1);
			}
			mappedWords.put(word, 1);
		}
		
		return mappedWords;
	}
	
	public static Map<String, Integer> sorted(Map<String, Integer> mappedWords) {

		List<Integer> wordsByCount = new ArrayList<Integer>(mappedWords.values());

		Collections.sort(wordsByCount, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		return mappedWords;

	}
	
	public Map<String, Integer> returnTopTenWords(List<String> words) {
		Map<String, Integer> mappedWords = mapped(words); 
		
		List<String> sorted = 
		
		for (String word : words) {
			
		}
		
		return topTen;
	}
}
