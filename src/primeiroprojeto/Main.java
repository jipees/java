package primeiroprojeto;

public class Main {
	public static void main(String[] args) {
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: top Gun : Maverick");
		
		int ano = 2022;
		double media = (9.5 + 5.6 +8.0)/3;
		String sinopse;
		sinopse = """
				Filme Top Gun
				Filme de aventura
				ano de lançamento
				""" + ano;
		System.out.println(sinopse);
		int classificacao;
		classificacao = (int) (media/2);
		System.out.println(classificacao);
	}
}
