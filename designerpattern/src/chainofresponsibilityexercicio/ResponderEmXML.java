package chainofresponsibilityexercicio;

public class ResponderEmXML implements Resposta{
	
	private Resposta proximo;

	@Override
	public void setProximo(Resposta resposta) {
		this.proximo = resposta;
	}


	@Override
	public void exibir(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato()!=null && requisicao.getFormato().equals(Formato.XML)){
			System.out.println("<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>");
		} else {
			proximo.exibir(requisicao, conta);
		}
	}

}
