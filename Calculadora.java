package javaDio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int mult =multiplicacao(a,b);
		int sub = subtracao(a,b);
		int div = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(div);
		System.out.println(sub);
		System.out.println(mult);

	}
	
	public static int soma (int a, int b) {
		return a +b;
	}
	
	public static int subtracao (int a, int b) {
		return a- b;
	}
	
	public static int multiplicacao (int a, int b) {
		return a *b;
	}
	
	public static int divisao (int a, int b) {
		return a /b;
	}

}
