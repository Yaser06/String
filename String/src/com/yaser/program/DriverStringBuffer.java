package com.yaser.program;

public class DriverStringBuffer {
	public static void main(String[] args) {
		StringBuffer stringBuffer =new StringBuffer();
		// String builder ve String buffer�n bir s�r� metodu bulunmaktad�r.Tek tek metodlar� deneyiniz.
		
		String name="Yaser";
		for (int i = 0; i <10 ; i++) {
			stringBuffer.append(name);
		}
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
		
	}

}
