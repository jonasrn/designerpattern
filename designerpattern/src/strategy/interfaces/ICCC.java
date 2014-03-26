package strategy.interfaces;

public class ICCC implements Imposto {

	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.06;
		} else if (orcamento.getValor() > 10000 && orcamento.getValor() < 3000) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.08 + 30.0;
		}

	}
}
