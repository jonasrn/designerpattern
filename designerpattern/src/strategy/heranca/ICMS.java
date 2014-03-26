package strategy.heranca;

public class ICMS extends Imposto{

	@Override
	double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	
}
