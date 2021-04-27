import java.util.Scanner;

/**
 * @author Bruna Silva Aplicação que irá definir se a pessoa que está se
 *         cadastrando no sistema é um cliente ou um funcionário
 * 
 */
public class Aplicacao {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Bruna", 19, "f");
		Conta c = new Conta("Bruna", 19, "f", "fisica", "12365478999");
		Funcionario f = new Funcionario("Bruna", 19, "f", 1, 999, "Caixa");
		Cliente d = new Cliente("Bruna", 19, "f", "rua das aboboras", "3133333333");
		Scanner dados = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		/**
		 * Pergunta ao usuário se ele é um funcionário ou cliente, sendo assim,
		 * há duas opções, 1 e 2)
		 * 
		 */

		System.out.println("Digite 1 para Funcionário ou 2 para Cliente: ");
		int TipoPessoa = entrada.nextInt();
		switch (TipoPessoa) {
		/**
		 * Caso o usuário seja um funcionário, ele deverá responder as seguintes
		 * perguntas: nome, idade, cpf, sexo, salario, cargo e o sistema irá
		 * gerar um identificador. Ao final irá conferir se o cpf é válido e se
		 * é maior de idade.
		 * 
		 */
		case 1:
			System.out.println("Digite seu nome: \n");
			p.setNome(dados.nextLine());
			System.out.println("Digite sua idade: \n");
			p.setIdade(dados.nextInt());
			System.out.println("Digite seu cpf (somente numeros): \n");
			dados.nextLine();
			c.setCpf(dados.nextLine());
			System.out.println("Digite F paraa sexo feminino ou M para masculino: \n");
			p.setSexo(dados.nextLine());
			System.out.println("Digite o salario: \n ");
			f.setSalario(dados.nextInt());
			System.out.println("Digite o cargo: \n ");
			dados.nextLine();
			f.setCargo(dados.nextLine());
			System.out.println("O identificador do funcionário é:  \n" + Funcionario.getId());
			System.out.println("Nome: \n" + p.getNome() + " Idade: \n" + p.getIdade() + "Cpf: \n" + c.getCpf()
					+ "Sexo: \n" + p.getSexo() + "Salário: \n" + f.getSalario() + "Cargo: \n" + f.getCargo());

			if (p.ehMaior(p.getIdade())) {
				System.out.println("É maior de idade");
			} else
				System.out.println("É menor de idade");

			/**
			 * Verifica se o numero do cpf é correto ou não
			 */
			if (c.ehCpf(c.getCpf())) {
				System.out.println("O numero do cpf é valido");
			} else
				System.out.println("Numero incorreto");

			break;
		/**
		 * Caso o usuário seja um cliente, será solicitado que ele preencha os
		 * seguintes dados: nome, idade, cpf, sexo, endereço e telefone. Ao
		 * final também irá conferir se o cliente é maior de idade e se o cpf é
		 * válido.
		 * 
		 */
		case 2:
			System.out.println("Digite seu nome:");
			p.setNome(dados.nextLine());
			System.out.println("Digite sua idade");
			p.setIdade(dados.nextInt());
			System.out.println("Digite seu cpf (somente numeros): ");
			c.setCpf(dados.nextLine());
			System.out.println("Digite F para sexo feminino ou M para masculino:");
			p.setSexo(dados.nextLine());
			System.out.println("Digite o endereço:  ");
			d.setEndereco(dados.nextLine());
			System.out.println("Digite o telefone(apenas números): ");
			d.setTelefone(dados.nextLine());
			System.out.println("Nome: " + p.getNome() + "Idade: " + p.getIdade() + "Cpf: " + c.getCpf() + "Sexo: "
					+ p.getSexo() + "Endereço: " + d.getEndereco() + "Telefone: " + d.getTelefone());

			if (p.ehMaior(p.getIdade())) {
				System.out.println("É maior de idade");
			} else
				System.out.println("É menor de idade");

			/**
			 * Verifica se o numero do cpf é correto ou não
			 */
			if (c.ehCpf(c.getCpf())) {
				System.out.println("O numero do cpf é valido");
			} else
				System.out.println("Numero incorreto");
			break;
		default:
			System.out.println("Comando inválido");
			break;
		}

		dados.close();
		entrada.close();
	}

}
