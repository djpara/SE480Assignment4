package test.filters;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import filters.NonAlphaRemover;

public class NonAlphaRemoverTest {

	NonAlphaRemover nAR;
	
	String testString;
	String expectedResultString;
	
	@Before
	public void setUp() throws Exception {
		nAR = new NonAlphaRemover();
		
		testString = "With this Example22, I'm 97hoping to extract all231 09non08-alphabetic characters.";
		expectedResultString = "With this Example Im hoping to extract all nonalphabetic characters";
	}

	@After
	public void tearDown() throws Exception {
		nAR = null;
		
		testString = null;
		expectedResultString = null;
	}

	@Test
	public void test() {
		String result = nAR.removeNonAlpha(testString);
		assertEquals(expectedResultString, result);
	}

}
