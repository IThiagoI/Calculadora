
package br.com.calculadora;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("******* Calculadora *******");
		System.out.println("Digite o primeiro número: ");
		calculadora.setNum1(teclado.nextInt());
		
		System.out.println("Digite o segundo número: ");
		calculadora.setNum2(teclado.nextInt());
		
		System.out.println("""
				Escolha uma das Opções: 
					1 - Somar
					2 - Subtrair
					3 - Multiplicar
					4 - Dividir
					5 - Porcentagem
				""");
		int numeroEscolhido = teclado.nextInt(); 
		
		if (numeroEscolhido < 1 || numeroEscolhido > 5) {
			System.out.println("Número Incorreto, por favor digite novamente");
			System.out.println("""
					Escolha uma das Opções: 
						1 - Somar
						2 - Subtrair
						3 - Multiplicar
						4 - Dividir
						5 - Porcentagem
					""");
			numeroEscolhido = teclado.nextInt();
		}
		
		switch (numeroEscolhido) {
		case 1:
			calculadora.soma();
			break;
		case 2:
			calculadora.subtracao();
			break;
		case 3:
			calculadora.multiplicacao();
			break;
		case 4:
			calculadora.divisao();
			break;
		case 5:
			calculadora.porcentagem();
			break;
		default:
			System.out.println("Algo deu errado!!");
			break;
		}
	
	String formatador = String.format("%s %s %s = %s",calculadora.getNum1(), calculadora.getSinal(), calculadora.getNum2(), calculadora.getTotal());
	System.out.println("O resultado do cálculo é: " + formatador);
	
	teclado.close();
	
	}
}
