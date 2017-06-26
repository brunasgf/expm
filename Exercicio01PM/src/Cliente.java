/**
 * 
 * @author Bruna 
 * Solicita os dados do cliente: endereço e telefone.
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
	 * get: visualiza o endereço do cliente
	 * 
	 * @return retorna o endereço do cliente
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * possibilita modificação do variavel
	 * 
	 * @param endereço
	 *            acessa atributo de próprio escopo
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
	 * possibilita modificação do variavel
	 * 
	 * @param telefone
	 *            acessa atributo de próprio escopo
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Verifica se o telefone do cliente é válido
	 * 
	 * @param telefone
	 *            recebe o numero do cliente
	 * @return retorna se o numero é válido ou não
	 */
	public boolean ehVerdadeiro(String telefone) {
		if (telefone.length() == 11 || telefone.length() == 10)
			return true;
		else
			return false;
	}

}
