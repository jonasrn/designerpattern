package strategy.interfaces.investimentos;

import java.util.Random;

public class Arrojado implements Invertimento {

	@Override
	public double calcularInvertimento(Conta conta) {
		boolean escolhido = new Random().nextDouble() > 0.50; // 50% de chance
		if (escolhido) {

			escolhido = new Random().nextDouble() > 0.30; // 30%
			if (escolhido) {
				return conta.getSaldo() * 0.3; // 30%
			}

			return conta.getSaldo() * 0.5; // 20%
		}

		return conta.getSaldo() * 0.06; // 50%
	}
}
