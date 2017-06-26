/**
 * 
 * @author Bruna 
 * Cria um contador para gerar um identificador único, solicita
 *         salário do funcionário e solicita o cargo do funcionário
 */
public class Funcionario extends Pessoa {
	private static int cont = 0;
	private static final int id = cont;
	private int salario;
	private String cargo;

	/**
	 * 
	 * @param nome
	 *            do funcionário
	 * @param idade
	 *            do funcionário
	 * @param sexo
	 *            do funcionário
	 * @param id
	 *            do funcionário
	 * @param salario
	 *            do funcionário
	 * @param cargo
	 *            do funcionário cont = a cada usuário de funcionário criado, é
	 *            gerado um id exclusivo
	 */
	public Funcionario(String nome, int idade, String sexo, int id, int salario, String cargo) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.cargo = cargo;
		cont++;

	}

	/**
	 * get: visualiza o salário do funcionário
	 * 
	 * @return retorna o salário do funcionário
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * possibilita modificação do variavel
	 * 
	 * @param salario
	 *            acessa atributo de próprio escopo
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * get: visualiza o cargo do funcionário
	 * 
	 * @return retorna o cargo do funcionário
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * possibilita modificação do variavel
	 * 
	 * @param cargo
	 *            acessa atributo de próprio escopo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * get: visualiza a id do funcionário
	 * 
	 * @return retorna a id do funcionário
	 */
	public static int getId() {
		return id;
	}

	/**
	 * Verifica se o funcionário recebe salário minimo
	 * 
	 * @param salario
	 *            recebe o salário do funcionário
	 * @return retorna se o funcionario recebe o salário minimo ou não
	 */
	public boolean ehSalarioMinimo(int salario) {
		if (salario >= 924)
			return true;
		else
			return false;
	}

}
