package br.alura.refatoracao.cap4;

public class ContaPJ extends ContaBancaria {

	public ContaPJ(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}

	@Override
	public void saca(double valor) {
		super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.2);
	}

}
