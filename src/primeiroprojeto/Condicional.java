package primeiroprojeto;

public class Condicional {
	public static void main(String[] args) {
		int anoDeLacamento = 2022;
		double notaDoFilme = 8.1;
		boolean incluidoNoplano = true;
		String tipoPlano = "plus";
		
		if (anoDeLacamento >= 2022) {
			System.out.println("Laçamento que os clientes estão curtindo!");
		} else {
			System.out.println("filme retrô!");
		}
		if (incluidoNoplano == true || tipoPlano .equals("plus")) {
			System.out.println("Filme liberado");
		}else {
			System.out.println("Deve aluga o filme");
		}
	}
}
