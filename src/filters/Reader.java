package filters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public Reader() { }

	public void readFilePush (String textFile) {
		try {
			String textLine;
			
			FileReader fr = new FileReader(textFile);
			BufferedReader br = new BufferedReader(fr);
			
			while ((textLine = br.readLine()) != null) { 
				// Pipes the line read by buffered reader to the non-alpha remover
				sendToNonAlphaRemover(br.readLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File "+ textFile + ", was not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading file: " + textFile + ".");
			e.printStackTrace();
		}
	}
	
	private void sendToNonAlphaRemover(String line) {
		NonAlphaRemover nAR = new NonAlphaRemover();
		nAR.removeNonAlphaPush(line);
	}
	
}
