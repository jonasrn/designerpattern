package decoretor;

import java.util.ArrayList;
import java.util.List;

public class FiltroParaContasComSaldoMenorQue100 extends Filtro{

	public FiltroParaContasComSaldoMenorQue100(Filtro filtro){
		super(filtro);
	}
	
	public FiltroParaContasComSaldoMenorQue100() {
		super();
	}
	
	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
          if(c.getValor() < 100) filtrada.add(c);
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
	}
}
