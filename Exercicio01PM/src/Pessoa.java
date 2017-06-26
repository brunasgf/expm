/**
 * @author Bruna Silva
 * nome do cliente
 * idade do cliente 
 *  sexo do cliente
 */
public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
/**
 * torna publico alguns dados do cliente 
 * @param nome do cliente 
 * @param idade do cliente 
 * @param sexo do cliente 
 */
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
/**
 * get: visualiza o nome do cliente 
 * @return retorna o nome do cliente 
 */
	public String getNome() {
		return nome;
	}
/**
 * possibilita modifica��o do variavel
 * @param nome acessa atributo de pr�prio escopo
 */
	public void setNome(String nome) {
		this.nome = nome;
	}
/**
 * get: visualiza a idade do cliente 
 * @return retorna a idade do cliente 
 */
	public int getIdade() {
		return idade;
	}
/**
 * possibilita modifica��o do variavel
 * @param idade acessa atributo de pr�prio escopo
 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
/**
 * get: visualiza o sexo do cliente
 * @return retorna o sexo do cliente 
 */
	public String getSexo() {
		return sexo;
	}
/**
 * possibilita modifica��o do variavel
 * @param sexo acessa atributo de pr�prio escopo
 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
/**
 * verifica se o cliente � maior de idade 
 * @param idade confere se idade fornecida � maior ou igual que 18 
 * @return retorna se cliente � maior de idade ou n�o 
 */
	public boolean ehMaior(int idade) {
		if (idade >= 18)
			return true;
		else
			return false;

	}

}
