package com.bytebank.bank.especial;

import com.bytebank.bank.model.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += saldo;
	}

}
