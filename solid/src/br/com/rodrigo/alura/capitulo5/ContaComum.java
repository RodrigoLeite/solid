package br.com.rodrigo.alura.capitulo5;

public class ContaComum implements Conta {

	private ManipuladorDeSaldo manipulador;

	public ContaComum() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		this.manipulador.deposita(valor);
	}

	public void saca(double valor) {
		this.manipulador.saca(valor);
	}

	@Override
	public void rende() {
		this.manipulador.rende(0.01);
	}

	@Override
	public double getSaldo() {
		return this.manipulador.getSaldo();
	}
}
