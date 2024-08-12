package primeiroprojeto;

import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu filme");
		String filme = leitura.nextLine();
		System.out.println(filme);
		System.out.println("Ano de lançamento");
		int anoDeLancamento = leitura.nextInt();
		System.out.println("nota do filme");
		double avaliacao = leitura.nextDouble();
		System.out.println(anoDeLancamento);
		System.out.println(avaliacao);
		
		leitura.close();
	}
}
