package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateAndTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentStamp = LocalDateTime.now();
		
		System.out.println("Today Date:");
		System.out.println(today);
		System.out.println("Current Time:");
		System.out.println(currentTime);
		System.out.println("Current Date & Time:");
		System.out.println(currentStamp);
		
		//Customizeing the date:
		LocalDate independenceDate = LocalDate.of(1999, 8, 15);
		System.out.println(independenceDate);
		
		LocalDate nextDate = today.plus(2,ChronoUnit.DAYS);
		System.out.println(nextDate);
	}

}
