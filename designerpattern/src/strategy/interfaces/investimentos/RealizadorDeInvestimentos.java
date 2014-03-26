package strategy.interfaces.investimentos;

public class RealizadorDeInvestimentos {
	
	public void invertir(Invertimento invertimento, Conta conta){
		double retorno = invertimento.calcularInvertimento(conta);
		double retornoPorcentagem = retorno * 0.75;
		conta.setSaldo(conta.getSaldo()+retornoPorcentagem);
	}

}
