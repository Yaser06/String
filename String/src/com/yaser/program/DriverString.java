package com.yaser.program;

public class DriverString {	
	// Stringler immutubled�r.Yani String kendisi degismez.Refarans� degisir.

	public static void main(String[] args) {
		String str ="Yaser";
		str ="M�cahit";
		System.out.println(str); // Yaser degil m�cahit oldu ama degi�en refans oldu.Artik baska yeri g�steriyor.
		
		String str2 ; // Stringlerin default degeri nulld�r.
	
		String name="Yaser";
		String name2="YASER";
		// Bunlar ayn� objemidir.
		
		
		if(name==name2) {
			System.out.println("Yes same object.");
		}else {
			System.out.println("No different object");
		}
		
	
		
		
		
	}

}
