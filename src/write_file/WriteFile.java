package write_file;

import java.io.*;

public class WriteFile {
	public static void main(String[] args) {

		// How to write a file using Java (4 popular options)

		// FileWriter = Good for small or medium-sized text files
		// BufferedWriter = Better performance for large amounts of text
		// PrintWriter = Best for structured data, like reports or logs
		// FileOutputStream = Best for binary files (e.g., images, audio files)

		String filePath = "C:\\Users\\marsh\\OneDrive\\Escritorio\\test.txt";
		String textContent = """
				Roses are Red
				Violets are Blue
				BOOTY BOOTY BOOTY
				ROCKIN' EVERYWHERE!
				""";

		try(FileWriter writer = new FileWriter(filePath)) {
			writer.write(textContent);
			System.out.println("File has been written");
		} catch(FileNotFoundException e) {
			System.out.println("COULD NOT LOCATE FILE LOCATION");
		} catch(IOException e) {
			System.out.println("COULD NOT WRITE FILE");
		}
	}
}
