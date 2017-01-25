package br.com.rodrigo.alura.capitulo5;

public class ContaDeEstudante implements Conta {
	
	private ManipuladorDeSaldo manipulador;
	
	private int milhas;
	
	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}

    public void deposita(double valor) {
        this.manipulador.deposita(valor);
        this.milhas += (int)valor;
    }
    
	public void saca(double valor) {
		this.manipulador.saca(valor);
	}

    public int getMilhas() {
        return milhas;
    }

	@Override
	public void rende() {}

	@Override
	public double getSaldo() {
		return this.manipulador.getSaldo();
	}
}
