package chainofresponsibilityexercicio;

public class ResponderNaoHaFormato implements Resposta{
	
	public Resposta proximo;

	@Override
	public void setProximo(Resposta resposta) {
		this.proximo = resposta;
	}

	@Override
	public void exibir(Requisicao requisicao, Conta conta) {
		System.out.println("Não foi informado nenhum formato");
	}

}
