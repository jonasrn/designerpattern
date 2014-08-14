package decoretor;

public class ImpostoAlto extends Imposto{
	
	public ImpostoAlto(Imposto imposto){
		super(imposto);
	}
	
	public ImpostoAlto(){
		super();
	}
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoProximoImposto(orcamento);
	}

	private double calculoDoProximoImposto(Orcamento orcamento) {
		return outroImposto.calcula(orcamento);
	}

}
