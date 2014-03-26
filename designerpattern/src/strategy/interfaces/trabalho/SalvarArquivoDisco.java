package strategy.interfaces.trabalho;

import java.io.File;

public class SalvarArquivoDisco {
	
	public void salvarArquivo(ModeloArquivo modelo, File file){
		modelo.salvar(file);
	}

}
