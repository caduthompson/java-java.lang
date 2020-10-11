package com.bytebank.bank.test;

import com.bytebank.bank.model.ContaCorrente;
import com.bytebank.bank.model.ContaPoupanca;

public class Test {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22); // Object is the Biggest generic class

		System.out.println(cc);
		
		System.out.println(cp.toString()); 
		System.out.println(cp); // It's the same, method toString() is implied

		println(cc);
	}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
//	static void println(ContaCorrente cc) {}
	static void println(Object referencia) {}
}