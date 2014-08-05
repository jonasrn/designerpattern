package chainofresponsibilityexercicio;


public class TestaCorrete {
	
	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		Requisicao requisicao = new Requisicao(Formato.XML); 
		Conta conta = new Conta();
		conta.setSaldo(10.0);
		conta.setTitular("Jonas Nepomuceno");
		
		servidor.receber(requisicao, conta);
	}

}
