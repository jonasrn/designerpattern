package decoretor;

public class ICPP extends TemplatePassoCalcularImposto{
	
	
	public ICPP() {}

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
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
