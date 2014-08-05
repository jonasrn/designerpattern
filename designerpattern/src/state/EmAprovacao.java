package state;


public class EmAprovacao implements EstadoDeUmOrcamento{
	public void aplicaDescontoExtra(Orcamento orcamento){
		for (EstadoDeUmOrcamento estado : orcamento.getHistoricoEstado()) {
			if(estado instanceof EmAprovacao){
				throw new RuntimeException("Já foi dado o desconto uma vez para estado EM APROVACAO");
			}
		}
		orcamento.valor -= orcamento.valor * 0.05;
		orcamento.addUmEstadoNoHistorico(new EmAprovacao());
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento no estado em aprovacao não podem ir direto para estado finalizado");
	}
}
