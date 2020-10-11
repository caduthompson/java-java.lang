package com.forthompson.bytebank;

import com.bytebank.bank.model.Conta;
import com.bytebank.bank.model.ContaCorrente;

public class LibraryTest {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(200.3);
		
		System.out.println(c.getSaldo());
	}

}
