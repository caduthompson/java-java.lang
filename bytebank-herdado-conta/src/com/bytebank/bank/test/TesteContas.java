package com.bytebank.bank.test;

import com.bytebank.bank.model.ContaCorrente;
import com.bytebank.bank.model.ContaPoupanca;
import com.bytebank.bank.model.SaldoInsuficienteException;


public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{

		// Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo da Conta Poupanca: " + cp.getSaldo());
	}

}
