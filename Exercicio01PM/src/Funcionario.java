/**
 * 
 * @author Bruna 
 * Cria um contador para gerar um identificador �nico, solicita
 *         sal�rio do funcion�rio e solicita o cargo do funcion�rio
 */
public class Funcionario extends Pessoa {
	private static int cont = 0;
	private static final int id = cont;
	private int salario;
	private String cargo;

	/**
	 * 
	 * @param nome
	 *            do funcion�rio
	 * @param idade
	 *            do funcion�rio
	 * @param sexo
	 *            do funcion�rio
	 * @param id
	 *            do funcion�rio
	 * @param salario
	 *            do funcion�rio
	 * @param cargo
	 *            do funcion�rio cont = a cada usu�rio de funcion�rio criado, �
	 *            gerado um id exclusivo
	 */
	public Funcionario(String nome, int idade, String sexo, int id, int salario, String cargo) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.cargo = cargo;
		cont++;

	}

	/**
	 * get: visualiza o sal�rio do funcion�rio
	 * 
	 * @return retorna o sal�rio do funcion�rio
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * possibilita modifica��o do variavel
	 * 
	 * @param salario
	 *            acessa atributo de pr�prio escopo
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * get: visualiza o cargo do funcion�rio
	 * 
	 * @return retorna o cargo do funcion�rio
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * possibilita modifica��o do variavel
	 * 
	 * @param cargo
	 *            acessa atributo de pr�prio escopo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * get: visualiza a id do funcion�rio
	 * 
	 * @return retorna a id do funcion�rio
	 */
	public static int getId() {
		return id;
	}

	/**
	 * Verifica se o funcion�rio recebe sal�rio minimo
	 * 
	 * @param salario
	 *            recebe o sal�rio do funcion�rio
	 * @return retorna se o funcionario recebe o sal�rio minimo ou n�o
	 */
	public boolean ehSalarioMinimo(int salario) {
		if (salario >= 924)
			return true;
		else
			return false;
	}

}
