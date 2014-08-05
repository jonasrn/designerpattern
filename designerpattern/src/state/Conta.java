package state;

public class Conta {
	
	protected double saldo;
	protected EstadoConta estadoConta;
	
	public void depositar(double valor){
		estadoConta.depositar(this, valor);
	}

	public double getSaldo() {
		return saldo;
	}
}
