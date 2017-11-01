package test.filters;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import filters.SentenceSplitter;

public class SentenceSplitterTest {
	
	SentenceSplitter sS;
	
	String testString;
	String[] expectedResultString;

	@Before
	public void setUp() throws Exception {
		sS = new SentenceSplitter();
		
		testString = "With this Example Im hoping to extract all nonalphabetic characters";
		expectedResultString = new String[]{"With", "this", "Example", "Im", "hoping", "to", "extract", "all", "nonalphabetic", "characters"};
		
	}

	@After
	public void tearDown() throws Exception {
		sS = null;
		
		testString = null;
		expectedResultString = null;
		
	}

	@Test
	public void test() {
		String[] result = sS.split(testString);
		assertEquals(expectedResultString, result);
	}

}
