import java.util.Scanner;

/**
 * @author Bruna Silva Aplica��o que ir� definir se a pessoa que est� se
 *         cadastrando no sistema � um cliente ou um funcion�rio
 * 
 */
public class Aplicacao {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Bruna", 19, "f");
		Conta c = new Conta("Bruna", 19, "f", "fisica", "14249121640");
		Funcionario f = new Funcionario("Bruna", 19, "f", 1, 999, "Caixa");
		Cliente d = new Cliente("Bruna", 19, "f", "rua das aboboras", "3133333333");
		Scanner dados = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		/**
		 * Pergunta ao usu�rio se ele � um funcion�rio ou cliente, sendo assim,
		 * h� duas op��es, 1 e 2)
		 * 
		 */

		System.out.println("Digite 1 para Funcion�rio ou 2 para Cliente: ");
		int TipoPessoa = entrada.nextInt();
		switch (TipoPessoa) {
		/**
		 * Caso o usu�rio seja um funcion�rio, ele dever� responder as seguintes
		 * perguntas: nome, idade, cpf, sexo, salario, cargo e o sistema ir�
		 * gerar um identificador. Ao final ir� conferir se o cpf � v�lido e se
		 * � maior de idade.
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
			System.out.println("O identificador do funcion�rio �:  \n" + Funcionario.getId());
			System.out.println("Nome: \n" + p.getNome() + " Idade: \n" + p.getIdade() + "Cpf: \n" + c.getCpf()
					+ "Sexo: \n" + p.getSexo() + "Sal�rio: \n" + f.getSalario() + "Cargo: \n" + f.getCargo());

			if (p.ehMaior(p.getIdade())) {
				System.out.println("� maior de idade");
			} else
				System.out.println("� menor de idade");

			/**
			 * Verifica se o numero do cpf � correto ou n�o
			 */
			if (c.ehCpf(c.getCpf())) {
				System.out.println("O numero do cpf � valido");
			} else
				System.out.println("Numero incorreto");

			break;
		/**
		 * Caso o usu�rio seja um cliente, ser� solicitado que ele preencha os
		 * seguintes dados: nome, idade, cpf, sexo, endere�o e telefone. Ao
		 * final tamb�m ir� conferir se o cliente � maior de idade e se o cpf �
		 * v�lido.
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
			System.out.println("Digite o endere�o:  ");
			d.setEndereco(dados.nextLine());
			System.out.println("Digite o telefone(apenas n�meros): ");
			d.setTelefone(dados.nextLine());
			System.out.println("Nome: " + p.getNome() + "Idade: " + p.getIdade() + "Cpf: " + c.getCpf() + "Sexo: "
					+ p.getSexo() + "Endere�o: " + d.getEndereco() + "Telefone: " + d.getTelefone());

			if (p.ehMaior(p.getIdade())) {
				System.out.println("� maior de idade");
			} else
				System.out.println("� menor de idade");

			/**
			 * Verifica se o numero do cpf � correto ou n�o
			 */
			if (c.ehCpf(c.getCpf())) {
				System.out.println("O numero do cpf � valido");
			} else
				System.out.println("Numero incorreto");
			break;
		default:
			System.out.println("Comando inv�lido");
			break;
		}

		dados.close();
		entrada.close();
	}

}
