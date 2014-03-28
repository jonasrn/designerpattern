package chainofresponsibility;

public class TesteDesconto {

	public static void main(String[] args) {
		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double descontoFinal = calculadorDeDesconto.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
