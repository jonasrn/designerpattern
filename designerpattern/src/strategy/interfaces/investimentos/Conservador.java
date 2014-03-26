package strategy.interfaces.investimentos;

public class Conservador implements Invertimento {

	@Override
	public double calcularInvertimento(Conta conta) {
		return conta.getSaldo() * 0.08;
	}


}
