package read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {

		// How to read a file using Java (3 popular options)

		// BufferedReader + FileReader: Best for reading text files line-by-line
		// FileInputStream: Best for binary files (e.g., images, audio files)
		// RandomAccessFile: Best for read/write specific portions of a large file

		String filePath = "C:\\Users\\marsh\\OneDrive\\Escritorio\\test.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) System.out.println(line);
		} catch(FileNotFoundException e) {
			System.out.println("COULD NOT LOCATE FILE");
		} catch(IOException e) {
			System.out.println("SOMETHING WENT WRONG");
		}
	}
}
