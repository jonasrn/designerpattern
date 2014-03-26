package strategy.interfaces.investimentos;

import java.util.Random;

public class Moderado implements Invertimento {

	@Override
	public double calcularInvertimento(Conta conta) {
		
		boolean escolhido = new Random().nextDouble() > 0.50; 
		
		if(escolhido){
			return conta.getSaldo() * 0.25;
		} else {
			return conta.getSaldo() * 0.07;
		}
		
	}
}
