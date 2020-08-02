package controle;

import modelo.CNPJ;
import modelo.CPF;
import modelo.Documento;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;
import visao.Agenda;
import visao.UI;

public class AgendaPessoaJuridica extends Agenda {
	
	@Override
	public void iniciar() {
		int aux = 0;
		int op =  0; 
		PessoaJuridicaDAO pessoaJuridica = new PessoaJuridicaDAO();
		do {
			op = UI.menuPessoa();
			switch(op) {
			case 1:
				// cadastrando responsavel
				System.out.println("Cadastre o responsavel");
				String nome1 = UI.qualNome();
				Documento doc1 = new CPF( UI.qualCpf());
				int telefone1 = UI.qualTelefone();
				String endereco1 = UI.qualEndereco();
				//Cadastrando pessoa Juridica
				System.out.println("Cadastre a empresa");
				String nomeEmpresa = UI.qualNomedaEmpresa();
				Documento doc = new CNPJ( UI.qualCnpj());
				int telefone = UI.qualTelefone();
				String endereco = UI.qualEndereco();
				pessoaJuridica.adicionar(new PessoaJuridica(nomeEmpresa, telefone, endereco, doc, 
						new PessoaFisica(nome1,telefone1,endereco1,doc1)));
				break;
			case 2:
				pessoaJuridica.exibirAgenda();
				aux = UI.qualOpcao();
				pessoaJuridica.remover(aux);
				break;
				
			case 3:
				pessoaJuridica.exibirAgenda();
				aux = UI.qualOpcao();
				alterando(aux, pessoaJuridica);
				break;
			case 4:
				pessoaJuridica.exibirAgenda();
				break;
			case 5:
				System.out.println("Voltando");
			}	
		}while(op != 5);
		
	}
	
	public void alterando(int aux, PessoaJuridicaDAO pessoaJuridica) {
		// cadastrando responsavel
		System.out.println("Cadastre o responsavel");
		String nome1 = UI.qualNome();
		Documento doc1 = new CPF( UI.qualCpf());
		int telefone1 = UI.qualTelefone();
		String endereco1 = UI.qualEndereco();
		// cadastrando pessoa juridica
		String nomeEmpresa = UI.qualNomedaEmpresa();
		Documento doc = new CNPJ( UI.qualCnpj());
		int telefone = UI.qualTelefone();
		String endereco = UI.qualEndereco();
		pessoaJuridica.alterar(aux,new PessoaJuridica(nomeEmpresa, telefone, endereco, doc, 
				new PessoaFisica(nome1,telefone1,endereco1,doc1)));
	}
}
