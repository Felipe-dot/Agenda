package visao;

import java.util.Scanner;

public interface UI {
	

	public static int opcoes() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("=======Menu======");
		System.out.println("[1] Pessoa Fisica");
		System.out.println("[2] Pessoa Juridica");
		System.out.println("[3] sair do programa");
		int op = teclado.nextInt();

		return op;	
	}


	public static int menuPessoa() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("==========MENU===========");
		System.out.println("=========Digite==========");
		System.out.println("[1] Cadastrar Pessoa");
		System.out.println("[2] Remover Pessoa");
		System.out.println("[3] atualizar Pesssoa");
		System.out.println("[4] exibir Agenda de Pessoas");
		System.out.println("[5] Voltar a tela inicial");
		System.out.println("===========================");
		int op = teclado.nextInt();

		return op;	
	}


	public static String qualNome() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome da pessoa");
		String nome = teclado.nextLine();
		return nome;
	}

	public static String qualNomedaEmpresa() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome da  empresa");
		String nome = teclado.nextLine();
		return nome;
	}
	
	public static int qualCpf() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o CPF");
		int cpf = teclado.nextInt();
		return cpf;
	}
	public static int qualTelefone() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o telefone");
		int telefone = teclado.nextInt();
		return telefone;

	}

	public static int qualCnpj() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o CNPJ");
		int cnpj = teclado.nextInt();
		return cnpj;
	}

	public static String qualEmpresa() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o nome da Empresa");
		String empresa = teclado.nextLine();
		return empresa;

	}

	public static String qualEndereco() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o endereço");
		String endereco = teclado.nextLine();
		return endereco;
	}

	public static int qualOpcao() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o numero da Pessoa/Empresa que voce quer selecionar");
		int opcao = teclado.nextInt();
		return opcao;
	}

}
