package strategy.interfaces.investimentos;

public class Cliente {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setSaldo(100.0);

		Conta conta2 = new Conta();
		conta2.setSaldo(100.0);
		
		Conta conta3 = new Conta();
		conta3.setSaldo(100.0); 
		
		System.out.println("Valor antes do invertimento (1)"+conta1.getSaldo());
		System.out.println("Valor antes do invertimento (2)"+conta2.getSaldo());
		System.out.println("Valor antes do invertimento (3)"+conta3.getSaldo());

		Conservador conservador = new Conservador();
		Moderado moderado = new Moderado();
		Arrojado arrojado = new Arrojado();
		
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.invertir(conservador, conta1);
		realizadorDeInvestimentos.invertir(moderado, conta2);
		realizadorDeInvestimentos.invertir(arrojado, conta3);

		
		System.out.println("Valor depois do invertimento (1)"+conta1.getSaldo());
		System.out.println("Valor depois do invertimento (2)"+conta2.getSaldo());
		System.out.println("Valor depois do invertimento (3)"+conta3.getSaldo());		
	}

}
