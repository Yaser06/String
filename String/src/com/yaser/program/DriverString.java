package com.yaser.program;

public class DriverString {	
	// Stringler immutubledýr.Yani String kendisi degismez.Refaransý degisir.

	public static void main(String[] args) {
		String str ="Yaser";
		str ="Mücahit";
		System.out.println(str); // Yaser degil mücahit oldu ama degiþen refans oldu.Artik baska yeri gösteriyor.
		
		String str2 ; // Stringlerin default degeri nulldýr.
	
		String name="Yaser";
		String name2="YASER";
		// Bunlar ayný objemidir.
		
		
		if(name==name2) {
			System.out.println("Yes same object.");
		}else {
			System.out.println("No different object");
		}
		
	
		
		
		
	}

}
