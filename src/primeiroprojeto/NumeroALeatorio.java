package primeiroprojeto;

import java.util.Random;
import java.util.Scanner;

public class NumeroALeatorio {

	public static void main(String[] args) {
		int sortear = new Random().nextInt(100);
		int tentativa = 1;
		Scanner leitura = new Scanner(System.in);
		System.out.println("digite um numero de 1 ate 100 para adivinha com 5 tentativas!");
		int numero = leitura.nextInt();
		 while (tentativa <= 5) {
			if (numero == sortear) {
				String formatTexto = (tentativa == 1) ? "tentativa" : "tentativas";
				System.out.printf("Você acertou o numero %d com %d %s!",sortear,tentativa,formatTexto);
				break;
			}if (tentativa == 5) {
				System.out.printf("Que pena acabaram suas chance o numero era %d!",sortear);
				break;
			} if (numero > sortear) {
				System.out.printf("O numero e menor quer %d digite outro numero: ",numero);
				numero = leitura.nextInt();
				tentativa++;
				
			} else {
				System.out.printf("O numero e maior quer %d digite outro numero: ",numero);
				numero = leitura.nextInt();
				tentativa++;
			}
		}
		
		 leitura.close();

	}

}
