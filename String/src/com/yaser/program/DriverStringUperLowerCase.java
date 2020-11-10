package com.yaser.program;

public class DriverStringUperLowerCase {
	public static void main(String[] args) {
		String name ="yaser"; // Stringler cift tirnak ile yazilir.
		String name2 ;
		name2 =name.toUpperCase();
		System.out.println("Tüm harfleri büyük olarak yazdirdim --->>> " + name2);
		
		
		String name3  = "AKTAS";
		String name4=name3.toLowerCase();
		System.out.println("Tüm harflerini kücük olarak ceviriyorum.-->>>>" + name4);
		
		
		String str="Java";
		String str1="JAVA";
		
		if(str==str1) {
			System.out.println("The same object");
		}else {
			System.out.println("Not same. Different object");
		}
		
		// Birde Upper Case yaptýktan sonra bakalim.
		
		if(str.toUpperCase() ==str1.toUpperCase()) {
			System.out.println("Upper case after The same object");
		}else {
			System.out.println("Different object"); // == refarans kontrolü yaptýgý icin yine farklý gösterecek.
		}
		
	
		
		if(str.toUpperCase().equals(str1.toUpperCase())) {
			System.out.println("Equels Same object"); // dogru kullaným bu sekildedir.
			//equels objenin icini kontrol eder bu sekilde objeler kontrol ederiz.
		}else {
			System.out.println("Different object");
		}
		
		String s ="Aktas";
		String s1=new String("Aktas");
		
		if(s==s1) { // refarans kontrolü yapiyor.Onun icin farkli gösteriyor.
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
		
		
	}

}
