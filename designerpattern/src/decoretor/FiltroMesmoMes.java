package decoretor;

import java.util.ArrayList;
import java.util.List;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMesmoMes() {
		super();
	}

	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			// Verificar datas
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}
}
