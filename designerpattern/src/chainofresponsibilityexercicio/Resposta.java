package chainofresponsibilityexercicio;

public interface Resposta {
	void setProximo(Resposta resposta);
	void exibir(Requisicao requisicao,Conta conta);
}
