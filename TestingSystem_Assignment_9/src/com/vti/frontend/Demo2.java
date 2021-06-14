package com.vti.frontend;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Demo2 {
	public static void main(String[] args) {
		System.out.println("In theo định dạng Việt Nam với 2 ngày bất kỳ date1 và date2: ");
		Date date1 = new Date(2019 - 1900, 05 - 1, 12);
		Date date2 = new Date();
		System.out.println("In không có định dạng: ");
		System.out.println("Date1: " + date1.toString());
		System.out.println("Date2: " + date2.toString());
		System.out.println("\n");
		
		// In Date theo định dạng VN
		System.out.println("In theo định dạng VN: ");
		Locale locale = new Locale("vn","VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		System.out.println("Date1: " + dateFormat.format(date1));
		System.out.println("Date2: " + dateFormat.format(date2));
		
		System.out.println("\n");

		
		// In theo định dạng FULL, LONG, MEDIUM, SHORT
		System.out.println("In theo định dạng FULL, LONG, MEDIUM, SHORT: ");
		DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Date2, DateFormat.FULL: " + dateFormat1.format(date2));
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Date2, DateFormat.LONG: " + dateFormat2.format(date2));
		DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Date2, DateFormat.MEDIUM: " + dateFormat3.format(date2));
		DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Date2, DateFormat.SHORT: " + dateFormat4.format(date2));
		
		
	}
}
