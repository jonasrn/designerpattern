package observer;

public class NotaFiscalDao implements AcaoPosGerarNota{

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Salvando banco de dados");
	}

}
