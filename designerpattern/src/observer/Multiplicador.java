package observer;

public class Multiplicador implements AcaoPosGerarNota {

	private double valor;

	public Multiplicador(double valor) {
		this.valor = valor;
	}

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Valor da nota multiplicado é :"
				+ notaFiscal.getValorBruto() * valor);
	}

}
