/**
 * 
 * @author Bruna 
 * Solicita os dados do cliente: endere�o e telefone.
 *
 */
public class Cliente extends Pessoa {
	private String endereco;
	private String telefone;

	/**
	 * 
	 * @param nome
	 *            do cliente
	 * @param idade
	 *            do cliente
	 * @param sexo
	 *            do cliente
	 * @param endereco
	 *            do cliente
	 * @param telefone
	 *            do cliente
	 */
	public Cliente(String nome, int idade, String sexo, String endereco, String telefone) {
		super(nome, idade, sexo);
		this.endereco = endereco;
		this.telefone = telefone;
	}

	/**
	 * get: visualiza o endere�o do cliente
	 * 
	 * @return retorna o endere�o do cliente
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * possibilita modifica��o do variavel
	 * 
	 * @param endere�o
	 *            acessa atributo de pr�prio escopo
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * get: visualiza o telefone do cliente
	 * 
	 * @return retorna o telefone do cliente
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * possibilita modifica��o do variavel
	 * 
	 * @param telefone
	 *            acessa atributo de pr�prio escopo
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Verifica se o telefone do cliente � v�lido
	 * 
	 * @param telefone
	 *            recebe o numero do cliente
	 * @return retorna se o numero � v�lido ou n�o
	 */
	public boolean ehVerdadeiro(String telefone) {
		if (telefone.length() == 11 || telefone.length() == 10)
			return true;
		else
			return false;
	}

}
