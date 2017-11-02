package filters;

import java.util.ArrayList;
import java.util.List;

public class NonAlphaRemover {
	
	public NonAlphaRemover() { }
	
	public static void removeNonAlphaPushSplitter(List<String> lines) {
		String nonAlphaLine;
		
		List<String> nonAlphaLines = new ArrayList<String>();
		
		for (String line: lines) {
			nonAlphaLine = line.replace("[^a-zA-Z&&[\\S]]", "");
			nonAlphaLines.add(nonAlphaLine);
		}
		
		SentenceSplitter.splitPushStemmer(nonAlphaLines);
	}
	
	public String removeNonAlpha(String line) {
		return line.replaceAll("[^a-zA-Z&&[\\S]]", "");
	}

}
