package templatemethodrelatorio;

import java.util.List;

public class RelatorioSimples extends TemplateRelatorio {

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println("Relatorio Simples");
		System.out.println("Cabeçalho");
		System.out.println("Nome Banco:" + banco.getNome());

	}

	@Override
	protected void corpo(List<Conta> contas) {
		System.out.println("Corpo");
		for (Conta conta : contas) {
			System.out.println("Titular:" + conta.getTitular());
			System.out.println("Saldo:" + conta.getSaldo());
		}
	}

	@Override
	protected void rodape(Banco banco) {
		System.out.println("Rodapé");
		System.out.println("Telefone:" + banco.getTelefone());
	}

}
