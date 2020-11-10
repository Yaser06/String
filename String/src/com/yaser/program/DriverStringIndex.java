package com.yaser.program;

public class DriverStringIndex {
	public static void main(String[] args) {
		
		String name="Yaser";
		String name2=" Yaser Aktas ";
		String name3="Aktas?";
		String []name4 ;
		System.out.println(name.charAt(0)); // Karakter karakter alabiliriz.
		
		System.out.println(name.substring(0, 3)); // Arasindan bu sekilde secebilirz.Baslangic,son index yada arasindan bir deger.
		
		System.out.println(name.contains("Y"));
		System.out.println(name.contains("y")); //Kücük y icermemektedir./false
		
		
		System.out.println(name2);
		System.out.println(name2.trim()); // sag sol bosluklarý temizlemek icin kullandik.
		
		
	}

}
