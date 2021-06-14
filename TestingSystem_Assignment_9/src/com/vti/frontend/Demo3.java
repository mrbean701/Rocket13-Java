package com.vti.frontend;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Demo3 {
	public static void main(String[] args) {
		
		// In date theo định dạng "MM/dd/yyyy"
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		System.out.println("\n");
		
		// In date theo định dạng "dd/MM/yyyy"
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat1.format(new Date()));
		System.out.println("\n");

		// In date theo định dạng "dd---MM---yyyy"
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd---MM---yyyy");
		System.out.println(simpleDateFormat2.format(new Date()));
	}
}
