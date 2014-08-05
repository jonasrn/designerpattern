package templatemethodrelatorio;

import java.util.List;

public class RelatorioComplexo extends TemplateRelatorio {

	@Override
	protected void cabecalho(Banco banco) {
		System.out.println("Relatorio Complexo");
		System.out.println("Cabeçalho");
		System.out.println("Nome Banco:" + banco.getNome());
		System.out.println("Endereco:" + banco.getEndereco());
		System.out.println("Telefone:" + banco.getTelefone());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		System.out.println("Corpo");
		for (Conta conta : contas) {
			System.out.println("Titular:"+conta.getTitular());
			System.out.println("Agencia:"+conta.getAgencia());
			System.out.println("Numero"+conta.getNumero());
			System.out.println("Saldo:"+conta.getSaldo());
		}
	}

	@Override
	protected void rodape(Banco banco) {
		System.out.println("Rodapé");
		System.out.println("Email:" + banco.getEmail());
		System.out.println("Nome Banco:" + banco.getData());
	}

}
