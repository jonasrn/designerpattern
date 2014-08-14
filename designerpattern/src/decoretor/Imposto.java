package decoretor;

abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto(Imposto ouImposto) {
		outroImposto = ouImposto;

	}

	public Imposto() {

	}

	abstract double calcula(Orcamento orcamento);

}
