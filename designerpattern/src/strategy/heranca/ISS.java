package strategy.heranca;

public class ISS extends Imposto{

	@Override
	double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.6;
	}



}
