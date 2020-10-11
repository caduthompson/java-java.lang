package com.bytebank.bank.test;

public class StringTest {

	public static void main(String[] args) {
		
//		String empty = "";
//		System.out.println(empty.isEmpty());

		String empty = " ForThompson ";
		System.out.println(empty);
		
		String otherEmpty = empty.trim();
		System.out.println(otherEmpty);
		
		System.out.println(empty.contains("Tho"));
		System.out.println(empty.contains("Silva"));
		
		// String class objects are immutable
		String name = "ForThompson"; // Literal object
//		String other = new String("ForThompson");

		System.out.println(name.length());
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
//		String sub = name.substring(1);
//		System.out.println(sub);
		
//		int pos = name.indexOf("p");
//		System.out.println(pos);
		
//		char c = name.charAt(2);
//		System.out.println(c);
		
//		char c = 'O';
//		char d = 'o';
//		String other = name.replace(c, d);
				
		
		String other = name.replace("o", "0");
//		String other = name.toLowerCase();
		
		System.out.println(name);
		System.out.println(other);
	}

}
