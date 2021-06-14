package com.vti.frontend;

import java.text.NumberFormat;
import java.util.Locale;

public class Demo1 {
	public static void main(String[] args) {
		// tạo đối tượng NumberFormat
		Locale locale = new Locale("vn", "VN");
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		
		// default
		Double doulbeNum = 12345.6789;
		System.out.println("Không có định dạng: ");
		System.out.println("doubleNum: " + doulbeNum);
		
		// Định dạng VN
		System.out.println("In theo định dạng Việt Nam: ");
		System.out.println(numberFormat.format(doulbeNum));
		
		
		// Định dạng FR
		System.out.println("In theo định dạng France: ");
		NumberFormat numberFormat1 = NumberFormat.getInstance(new Locale("fr", "FR"));
		System.out.println(numberFormat1.format(doulbeNum));
		
		// Định dạng sau dấu phẩy chỉ có 1 số
		System.out.println("Set 1 tối đa 1 số sau dấu phẩy: ");
		numberFormat.setMaximumFractionDigits(1);
		System.out.println(numberFormat.format(doulbeNum));
		
		// Định dạng tiền tệ theo chuẩn VN
		System.out.println("In theo kiểu tiền tệ: ");
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(new Locale("vn","VN"));
		System.out.println(numberFormat2.format(doulbeNum));
		
		
	}
}
