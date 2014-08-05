package state;

public class Aprovado implements EstadoDeUmOrcamento{
	public void aplicaDescontoExtra(Orcamento orcamento){
		for (EstadoDeUmOrcamento estado : orcamento.getHistoricoEstado()) {
			if(estado instanceof EmAprovacao){
				throw new RuntimeException("Já foi dado o desconto uma vez para estado EM APROVACAO");
			}
		}
		orcamento.valor -= orcamento.valor * 0.05;
		orcamento.addUmEstadoNoHistorico(new Aprovado());
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está aprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
