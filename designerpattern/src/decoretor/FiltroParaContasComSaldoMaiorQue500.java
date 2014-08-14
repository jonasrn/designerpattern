package decoretor;

import java.util.ArrayList;
import java.util.List;

public class FiltroParaContasComSaldoMaiorQue500 extends Filtro{
	
	
	public FiltroParaContasComSaldoMaiorQue500(Filtro filtro){
		super(filtro);
	}
	
	public FiltroParaContasComSaldoMaiorQue500() {
		super();
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
          if(c.getValor() > 50000) filtrada.add(c);
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
	}

}
