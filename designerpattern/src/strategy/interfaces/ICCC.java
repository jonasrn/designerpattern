package strategy.interfaces;

public class ICCC implements Imposto {

	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.6;
		} else if (orcamento.getValor() > 10000 && orcamento.getValor() < 3000) {
			return orcamento.getValor() * 0.7;
		} else {
			return orcamento.getValor() * 0.8 + 30.0;
		}

	}
}
