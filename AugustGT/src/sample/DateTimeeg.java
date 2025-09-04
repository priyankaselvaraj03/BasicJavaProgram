package sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeeg {
	public static void main(String[] args) {
		LocalDate obj = LocalDate.now();
		System.out.println(obj);
		LocalTime obj1= LocalTime.now();
		System.out.println(obj1);
		LocalDateTime obj2=LocalDateTime.now();
		System.out.println(obj2);
		System.out.println(obj2.getHour());
		System.out.println(obj2.getDayOfMonth());
	}

}
