package br.com.vagton.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Exception {

    // Construtor que permite uma mensagem personalizada
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
