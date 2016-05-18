package br.alura.refatoracao.cap4;

public class ContaPF extends ContaBancaria {

	public ContaPF(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}

	@Override
	public void saca(double valor) {
		super.saca(valor + 0.1);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.1);
	}

}