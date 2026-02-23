package music_player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {

		// How to PLAY AUDIO with Java (.wav, .au, .aiff)

		String filePath = "";
		File file = new File(filePath);

		try(Scanner scanner = new Scanner(System.in);
		    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);

			String response = "";

			while (!response.equals("Q")) {
				System.out.println("P = Play");
				System.out.println("S = Stop");
				System.out.println("R = Reset");
				System.out.println("Q = Quit");;
				System.out.print("Enter your choice: ");
				response = scanner.next().toUpperCase();
				switch (response) {
					case "P" ->	clip.start();
					case "S" ->	clip.stop();
					case "R" ->	clip.setMicrosecondPosition(0);
					case "Q" ->	clip.close();
					default -> System.out.println("INVALID CHOICE");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
		} catch (UnsupportedAudioFileException e) {
			System.out.println("FORMAT NOT SUPPORTED");
		} catch (LineUnavailableException e) {
			System.out.println("AUDIO UNAVAILABLE");
		} catch(IOException e) { // Safety net
			System.out.println("SOMETHING WENT WRONG");
		} finally {
			System.out.println("BYE!");
		}

	}
}
