package com.yaser.program;

public class DriverStringConcat {
	public static void main(String[] args) {
		String name ="Yaser";
		String otherName = "zcf" + name + "fgh" + 45; // String concat ile ayn� sekilde birlestirme islemi yapm�stir
		// '+' operat�r� �zel olarak concat islemi yapabilmektir.Stringle toplanan sayiler String �zelligi g�sterir.
		System.out.println(otherName);
		
		String sum="";
				
		//String Builder metodu ile islemi gerceklestirdim.
		StringBuilder stringBuilder =new StringBuilder();
		for (int i = 0; i <10; i++) {
			stringBuilder.append(name);
		}
		System.out.println(stringBuilder.toString());
		
		
		// '+' Concat �zelligini kullanarak ayn� islemi gerceklestirdim.
		for (int i = 0; i < 10; i++) {
			sum +=name;
		}
		System.out.println(sum);
	
	}

}
