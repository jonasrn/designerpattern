package chainofresponsibility;

public interface Desconto {

	public double desconta(Orcamento orcamento);
	public void setDesconto(Desconto proximo);
}
