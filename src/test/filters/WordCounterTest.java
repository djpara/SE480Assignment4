package test.filters;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import filters.WordCounter;

public class WordCounterTest {
	
	List<String> words;
	Map<String, Integer> mappedWords;
	
	WordCounter wc;

	@Before
	public void setUp() throws Exception {
		words = new ArrayList<String>(Arrays.asList("to", "i", "me", "you", "me", "me", "to" ));
		mappedWords = new HashMap<String, Integer>();
		
		wc = new WordCounter();
	}

	@After
	public void tearDown() throws Exception {
		words = null;
		mappedWords = null;
		
		wc = null;
	}

	@Test
	public void test() {
		mappedWords = wc.mapped(words);
		
		assertEquals((Integer)3, mappedWords.get("me"));
	}

}
