package observer;

public class EnviarEmail implements AcaoPosGerarNota{

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Enviando email");
	}

}
