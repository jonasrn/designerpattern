package chainofresponsibility;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setDesconto(Desconto proximo) {
		// Não faz nada
	}

}
