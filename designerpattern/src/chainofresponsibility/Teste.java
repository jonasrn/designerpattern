package chainofresponsibility;

public class Teste {
	
	public static void main(String[] args) {
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(5000);
		
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
		calculadorDeImpostos.realizaCalculo(orcamento, iccc);
		
		
		
		
	}

}
