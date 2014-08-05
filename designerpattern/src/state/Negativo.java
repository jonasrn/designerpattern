package state;

public class Negativo implements EstadoConta{

	@Override
	public void depositar(Conta conta, double valor) {
		conta.saldo += valor * 0.95;		
	}



}
