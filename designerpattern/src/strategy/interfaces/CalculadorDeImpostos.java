package strategy.interfaces;

public class CalculadorDeImpostos {

	void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double imp = imposto.calcula(orcamento);
		System.out.println(imp);
	}
}
