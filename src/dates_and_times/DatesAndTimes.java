package dates_and_times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
	public static void main(String[] args) {

		// How to work with DATES & TIMES using Java
		// (LocalDate, LocalTime, LocalDateTIme, UTC Timestamp)

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime now = LocalDateTime.now();
		Instant instant = Instant.now();
		
		System.out.println("date = " + date);
		System.out.println("time = " + time);
		System.out.println("now = " + now);
		System.out.println("instant = " + instant);

		// Custom format

		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String newDateTime = dateTime.format(formatter);

		System.out.println("dateTime = " + dateTime);
		System.out.println("newDateTime = " + newDateTime);
		
		LocalDate anotherDate1 = LocalDate.of(2024, 12, 25);
		LocalDate anotherDate2 = LocalDate.of(2025, 12, 25);
		String anotherDateTime = LocalDateTime.of(2024, 12, 25, 12, 0, 0).format(formatter);
		System.out.println("anotherDate1 = " + anotherDate1);
		System.out.println("anotherDateTime = " + anotherDateTime);

		// Comparing dates
		if (anotherDate1.isBefore(anotherDate2)) {
			System.out.println(anotherDate1 + " is before " + anotherDate2);
		} else if (anotherDate1.isAfter(anotherDate2)) {
			System.out.println(anotherDate1 + " is after " + anotherDate2);
		} else if (anotherDate1.isEqual(anotherDate2)) {
			System.out.println(anotherDate1 + " is equals " + anotherDate2);
		}
	}
}
