package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private String observacao;
	private Calendar data;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private List<AcaoPosGerarNota> posGerarNotas;

	public NotaFiscalBuilder() {
		data = Calendar.getInstance();
		posGerarNotas = new ArrayList<AcaoPosGerarNota>();
	}

	public NotaFiscalBuilder(List<AcaoPosGerarNota> lista) {
		this.posGerarNotas = lista;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}

	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data,
				valorBruto, impostos, todosItens, observacao);

		for (AcaoPosGerarNota observer : posGerarNotas) {
			observer.executar(notaFiscal);
		}
		return notaFiscal;
	}
}
