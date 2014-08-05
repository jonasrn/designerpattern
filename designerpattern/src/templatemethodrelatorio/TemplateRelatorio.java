package templatemethodrelatorio;

import java.util.List;

public abstract class TemplateRelatorio {

	public void relatorio(Banco banco, List<Conta> contas) {
		cabecalho(banco);
		corpo(contas);
		rodape(banco);
	}
	protected abstract void cabecalho(Banco banco);
	
	protected abstract void corpo(List<Conta> contas);
	
	protected abstract void rodape(Banco banco);
	
}
