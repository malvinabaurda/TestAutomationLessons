package lesson4;

import java.io.*;
import java.nio.charset.Charset;

public class ReadAndWritePlainTextFile {

	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String line;
		try (
		    InputStream fis = new FileInputStream("c://temp//readme.txt");
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		) {
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		        
		    }
		}
	}
}
