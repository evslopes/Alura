package br.alura.refatoracao.cap4;

public abstract class ContaBancaria {
	protected double saldo;
	protected String titular;

	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		saldo = saldoInicial;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

}