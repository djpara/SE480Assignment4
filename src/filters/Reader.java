package filters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	
	public Reader() { }

	public void readFilePush (String textFile) {
		// Pipes the line read by buffered reader to the non-alpha remover
		sendToNonAlphaRemover(read(textFile));
	}
	
	private void sendToNonAlphaRemover(List<String> lines) {
		NonAlphaRemover.removeNonAlphaPushSplitter(lines);
	}
	
	public static List<String> read(String textFile) {
		
		List<String> textLines = new ArrayList<String>();
		
		try {
			FileReader fr = new FileReader(textFile);
			BufferedReader br = new BufferedReader(fr);
			
			String textLine;
			
			while ((textLine = br.readLine()) != null) { 
				textLines.add(textLine);
			}
			
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File "+ textFile + ", was not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading file: " + textFile + ".");
			e.printStackTrace();
		}
		
		return textLines;
		
	}
}
