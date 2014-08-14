package decoretor;

public abstract class TemplatePassoCalcularImposto extends  Imposto{
	
	 public TemplatePassoCalcularImposto(Imposto outroImposto) {
         super(outroImposto);
     }

     public TemplatePassoCalcularImposto() {
     }

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento); 

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}