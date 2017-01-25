package br.com.rodrigo.alura.capitulo2;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {
	
	public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

}
