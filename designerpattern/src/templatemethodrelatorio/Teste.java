package templatemethodrelatorio;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		// Cria contas
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		Conta conta4 = new Conta();
		Conta conta5 = new Conta();
		List<Conta> contas =  Arrays.asList(conta1);
		// Cria o banco
		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");
		banco.setEndereco("Rua filial x");
		banco.setTelefone("00-5555");
		banco.setEmail("bb@bb.com.br");
		banco.setData(new Date());
		
		// Cria Template Method
		TemplateRelatorio simples = new RelatorioSimples();
		TemplateRelatorio complexo = new RelatorioComplexo();
		simples.relatorio(banco, contas);
		complexo.relatorio(banco, contas);
		
		
	}

}
