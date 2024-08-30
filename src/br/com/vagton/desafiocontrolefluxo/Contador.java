package br.com.vagton.desafiocontrolefluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR")); 
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = lerNumeroInteiro(terminal); // Lê e valida o primeiro parâmetro
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = lerNumeroInteiro(terminal); // Lê e valida o segundo parâmetro
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
		terminal.close();
		
	}
	
	
	// Método para ler e validar entrada de número inteiro
    public static int lerNumeroInteiro(Scanner terminal) {
        String input;
        while (true) {
            input = terminal.nextLine().trim(); // Lê a entrada e remove espaços em branco
            if (input.isEmpty()) {
                System.out.println("O campo não pode estar vazio. Por favor, digite um número.");
            } else {
                try {
                    return Integer.parseInt(input); // Converte a entrada para inteiro
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                }
            }
        }
    }
    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// Validar se parametroUm é maior que parametroDois e lançar a exceção
	    if (parametroUm > parametroDois) {
	        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
	    }

	    int contagem = parametroDois - parametroUm;
	    
	    // teste 1
	    //realizar o for para imprimir os números com base na variável contagem
	    //for (int indice = 1; indice <= contagem; indice++) {
	    //    System.out.println("Imprimindo o número: " + (parametroUm + indice));
	    //}
	    for (int indice = 1; indice <= contagem; indice++) {
            System.out.println("Imprimindo o número " + indice);
        }
	}
}
