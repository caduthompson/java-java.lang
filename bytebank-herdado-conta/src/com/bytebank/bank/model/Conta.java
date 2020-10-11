package com.bytebank.bank.model;

/**
 * Class represents the frame of an account
 * 
 * @author Carlos Thompson
 *
 */

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta() {}
	
	/**
	 * Constructor to initialize object Account from the agency and number
	 * 
	 * @param agencia
	 * @param numero
	 */
	

	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas s�o: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor needs to be more than saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente:\n" + 
					"Saldo: " + this.saldo + 
					"\nValor do Saque: " + valor);// problema
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

}