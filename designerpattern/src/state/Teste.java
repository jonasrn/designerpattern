package state;

public class Teste {
	
	public static void main(String[] args) {

		Orcamento reforma = new Orcamento(5000);
	
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
	//	reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
	}

}
