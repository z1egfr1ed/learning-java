package alarm_clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
	public static void main(String[] args) {

		// JAVA ALARM CLOCK

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime alarmTime = null;

		while(alarmTime == null) {
			try {
				System.out.print("Enter alarm time (HH:mm:ss): ");
				String inputTime = sc.nextLine();

				alarmTime = LocalTime.parse(inputTime, formatter);
				System.out.println("Alarm time: " + alarmTime);
			} catch(DateTimeParseException e) {
				System.out.println("Invalid time format. Please use HH:mm:ss");
			}
		}

		AlarmClockClass alarmClock = new AlarmClockClass(alarmTime);
		Thread alarmClockThread = new Thread(alarmClock);
		alarmClockThread.start();

		sc.close();

	}
}
