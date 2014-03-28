package chainofresponsibility;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setDesconto(d2);
		d2.setDesconto(d3);
		
		return d1.desconta(orcamento);
		//--
	}
}
