package chainofresponsibilityexercicio;

public class Servidor {
	
	public void receber(Requisicao requisicao,Conta conta){
		Resposta resposta1 = new ResponderEmCSV();
		Resposta resposta2 = new ResponderEmPorCento();
		Resposta resposta3 = new ResponderEmXML();
		Resposta resposta4 = new ResponderNaoHaFormato();
		resposta1.setProximo(resposta2);
		resposta2.setProximo(resposta3);
		resposta3.setProximo(resposta4);
		resposta1.exibir(requisicao, conta);
	}

}
