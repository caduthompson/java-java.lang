package com.bytebank.bank.test;

import com.bytebank.bank.model.Conta;
import com.bytebank.bank.model.ContaCorrente;
import com.bytebank.bank.model.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("" + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
