public class ExcecaoDataInvalida extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String nomeAtr;
	public int valor;

	ExcecaoDataInvalida(String Nome, int val) {
		super("O atributo " + Nome + 
				" não pode receber " + val);
		nomeAtr = Nome;
		valor = val;
	}

}
