package strategy.heranca;

public class Teste {
	
	public static void main(String[] args) {
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500);
		
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
		
		
		
		
	}

}
