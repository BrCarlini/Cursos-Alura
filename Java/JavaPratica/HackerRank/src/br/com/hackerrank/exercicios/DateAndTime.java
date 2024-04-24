package br.com.hackerrank.exercicios;

import java.util.Calendar;
import java.util.Locale;


public class DateAndTime {
	
	
	public static String findDay(int month, int day, int year) {

	    Calendar c=Calendar.getInstance();

	    c.set(year,month-1,day);
 
	   return c.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, new Locale("pt", "BR")).toUpperCase(); // Locale.US

	}
	
	
	public static void main(String[] args) {
		
	}
	

}
