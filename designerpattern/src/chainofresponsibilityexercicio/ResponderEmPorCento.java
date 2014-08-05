package chainofresponsibilityexercicio;

public class ResponderEmPorCento implements Resposta{

	private Resposta proximo;
	
	public void setProximo(Resposta proximo) {
		this.proximo = proximo;
	}

	@Override
	public void exibir(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato()!=null && requisicao.getFormato().equals(Formato.PORCENTO)){
			System.out.println(conta.getTitular()+"%"+conta.getSaldo());
		} else {
			proximo.exibir(requisicao, conta);
		}		
	}
	
}
