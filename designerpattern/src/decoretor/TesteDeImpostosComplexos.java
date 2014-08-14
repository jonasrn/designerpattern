package decoretor;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ImpostoAlto(new ICMS());

		Orcamento orcamento = new Orcamento(500);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);
	}
}
