package primeiroprojeto;

import java.util.Scanner;

public class pratica {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/* Crie um programa que solicite ao usuário digitar um número.
		 Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/
		
		System.out.println("Digite um numero!");
		int numero = ler.nextInt();
		
		String posiNega = (numero < 0)? "numero negativo ":(numero == 0)? "numero é zero":"o numero é positivo";
		System.out.println(posiNega);
		
		/*Peça ao usuário para inserir dois números inteiros.
		 *  Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/
		
		System.out.println("Digite o primeiro numero!");
		int numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero!");
		int numero2 = ler.nextInt();
		
		String compara = (numero1 == numero2)? "são igual ":"são diferente";
		String maioMeno = (numero1 > numero2)? "é maior ":(numero1 == numero2)?"é igual o ":"é menor";
		
		System.out.printf("O numero %d e %d %s",numero1,numero2,compara);
		System.out.printf("\no %d %s %d",numero1,maioMeno,numero2);
		
		/*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" 
		 e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o 
		 cálculo da área com base na opção selecionada.*/
		
		int valor = 0;	
		System.out.println("\n\t--- Menu ---\nDigite 1. Calcular área do quadrado\nDigite 2. Calcular área do círculo");
		valor = ler.nextInt();
		
		switch (valor) {
		case 1:
			System.out.println("Qual o valor da largura do quadrado!");
			double largura = ler.nextDouble();
			System.out.println("Qual o valor da altura do quadrado");
			double altura = ler.nextDouble();
			
			double area =  largura * altura;
			
			System.out.printf("A area do quadrado é %.2f",area);
			
			break;
			
		case 2:
			System.out.println("Qual o valor do raio do círculo!");
			double raio = ler.nextDouble();
			
			double areaCirculo = Math.PI * Math.pow(raio, 2);
			
			System.out.printf("A area do círculo é %.2f",areaCirculo);
			break;

		default:
			System.out.println("valor invalido");
			break;
		}
		
		/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/
		
		System.out.println("Digite um numero!");
		int mutiplicado = ler.nextInt();
		System.out.printf("Tabuada do %d :",mutiplicado);
		
		for (int i = 1; i <= 10; i++) {
			int resultado = i * mutiplicado;
			
			System.out.printf("\n%d  x  %d  = %d",i,mutiplicado,resultado);
		}
		
		/*Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar
		 *  e exiba uma mensagem correspondente.*/
		
		System.out.println("\nDigite um numero!");
		int parOImpa = ler.nextInt();
		
		String verifica = (parOImpa % 2 == 0)? "é par " : "é impar";
		System.out.printf("O numero %d %s\n",parOImpa,verifica);
		
		/*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
*/
		System.out.println("Digite um numero!");
		int numerofatorial = ler.nextInt();
		int fatorial = 1;
		
		for (int i = 1 ;i <= numerofatorial; i++) {
			 fatorial *= i;
			
		}
		System.out.printf("O fatorial de %d! é %d",numerofatorial,fatorial);
		ler.close();
		
		

	}

}
