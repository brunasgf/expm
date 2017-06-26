public class ExcecaoDataInvalida extends Exception {
	public String nomeAtr;
	public int valor;

	ExcecaoDataInvalida(String Nome, int val) {
		super("O atributo " + Nome + 
				" não pode receber " + val);
		nomeAtr = Nome;
		valor = val;
	}

}
