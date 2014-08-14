package decoretor;

public class ICMS extends Imposto {

	public ICMS(Imposto imposto) {
		super(imposto);
	}

	public ICMS() {
		super();
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.5 + 50.0
				+ calculoDoProximoImposto(orcamento);
	}

	private double calculoDoProximoImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
}
