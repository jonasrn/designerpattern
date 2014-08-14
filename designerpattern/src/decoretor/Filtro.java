package decoretor;

import java.util.ArrayList;
import java.util.List;

abstract class Filtro {

	protected Filtro filtroProximo;
	
	public Filtro(Filtro filtro){
		this.filtroProximo = filtro;
	}
	
	public Filtro(){
	}
	
	public abstract List<Conta> filtrar(List<Conta> contas);
	
	protected List<Conta> proximo(List<Conta> contas) {
        if(filtroProximo != null) return filtroProximo.filtrar(contas);
        else return new ArrayList<Conta>();
    }
}
