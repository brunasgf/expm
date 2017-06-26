/**
 * 
 * @author Bruna Silva 
 * A classe possui os dados da conta de um cliente
 * nome: nome do cliente
 * idade : idade do cliente
 * sexo: opção de qual o sexo do cliente 
 * tipoPessoa: se o cliente é pessoa fisica ou juridica
 * cont: pula par proximo cliente
 * cpf: cpf do cliente 
 */

public class Conta {

	private String nome;
	private int idade;
	private String sexo;
	private String tipoPessoa;
	private String cpf;
/**
 * get: visualiza o tipo de cliente 
 * @return o tipo de pessoa
 */
	public String getTipoPessoa() {
		return tipoPessoa;
	}

/**
 * possibilita modificação do variavel
 * @param tipoPessoa acessa atributo de próprio escopo
 */
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
/**
 * visualiza o tipo de cliente 
 * @return o numero do cpf
 */
	public String getCpf() {
		return cpf;
	}
/**
 * possibilita modificação de variavel
 * @param cpf acessa atributo de próprio escopo 
 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
/**
 * torna publico alguns dados da conta
 * @param nome acessa atributo de próprio escopo
 * @param idade acessa atributo de próprio escopo
 * @param sexo acessa atributo de próprio escopo
 * @param tipoPessoa acessa atributo de próprio escopo
 * @param cpf acessa atributo de próprio escopo
 */
	public Conta(String nome, int idade, String sexo, String tipoPessoa, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.tipoPessoa = tipoPessoa;
		this.cpf = cpf;
	}
/**
 *  visualiza nome do cliente
 * @return retorna nome do cliente
 */
	public String getNome() {
		return nome;
	}
/**
 * possibilita modificação de variavel
 * @param nome acessa atributo de próprio escopo
 */
	public void setNome(String nome) {
		this.nome = nome;
	}
/**
 *  visualiza a idade do cliente 
 * @return retorna o nome do cliente 
 */
	public int getIdade() {
		return idade;
	}
/**
 * possibilita modificação de variavel 
 * 
 * @param idade acessa atributo de próprio escopo
 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
/**
 * visualiza o sexo do cliente
 * @return retorna o sexo do cliente
 */
	public String getSexo() {
		return sexo;
	}
/**
 * possibilita modificação de dados
 * @param sexo acessa atributo de próprio escopo
 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
/**
 * verifica se o cpf digitado esta correto 
 * @param cpf se o numero do cpf possuir quantidade diferente de 11 numeros 
 * @return retorna falso se possui mais de 11 numeros, verdadeiro se  possui quantidade diferente
 */
	public boolean ehCpf(String cpf) {
		if (cpf.length() != 11)
			return false;
		else
			return true;

	}
}
