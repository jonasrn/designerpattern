package decoretor;

public class ISS extends Imposto{

	public ISS(Imposto imposto){
		super(imposto);
	}
	
	public ISS(){
		super();
	}
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.6 + calculoDoProximoImposto(orcamento);
	}

	private double calculoDoProximoImposto(Orcamento orcamento) {
		return outroImposto.calcula(orcamento);
	}
}
