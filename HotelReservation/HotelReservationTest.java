package com.hotelreservation;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	@Test
HotelReservation hotelreservation = new HotelReservation(); 
	public void checkchepestHotelforregularcustomer()  try (ParseException e){
		String Hotel= hotelreservation.findCheapestHotel("20-03-2020","22-02-2020");
		Assert.assertEquals("Lakewood",Hotel);

		
		
	}
}
	