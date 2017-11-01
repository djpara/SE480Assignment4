package test.filters;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCounterTest {
	
	List<String> words;

	@Before
	public void setUp() throws Exception {
		words = new ArrayList<String>( Arrays.asList("to", "i", "me", "you", "me", "me", "to" ));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
