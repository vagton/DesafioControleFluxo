package br.com.vagton.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Exception {

	    // Construtor padrão
	    //public ParametrosInvalidosException() {
	    //   super("O Parámetro informado é inválido. Ele deve ser um número inteiro.");
	    //}

	    // Construtor que permite uma mensagem personalizada
	    public ParametrosInvalidosException(String mensagem) {
	        super(mensagem);
	    }
}
