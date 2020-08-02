package controle;

import modelo.CPF;
import modelo.Documento;
import modelo.PessoaFisica;
import visao.Agenda;
import visao.UI;

public class AgendaPessoaFisica extends Agenda{
	
	@Override
	public void iniciar() {
		int aux = 0;
		int op = 0;
		
		PessoaFisicaDAO pessoaFisica = new PessoaFisicaDAO();
		do {
			op = UI.menuPessoa();
			switch(op) {
			case 1:
				//Cadastrando pessoa fisica
				String nome = UI.qualNome();
				Documento doc = new CPF( UI.qualCpf());
				int telefone = UI.qualTelefone();
				String endereco = UI.qualEndereco();
				pessoaFisica.adicionar(new PessoaFisica(nome,telefone, endereco, doc));
				break;
			case 2:
				pessoaFisica.exibirAgenda();
				aux = UI.qualOpcao();	
				pessoaFisica.remover(aux);
				break;
			case 3:
				pessoaFisica.exibirAgenda();
				aux = UI.qualOpcao();	
				alterando(aux, pessoaFisica);
				break;
			case 4:
				pessoaFisica.exibirAgenda();
				break;
			case 5:
				System.out.println("Voltando");
			}
		}while(op != 5);
			
	}
	
	public void	alterando(int aux, PessoaFisicaDAO pessoaFisica) {
		String nome = UI.qualNome();
		Documento doc = new CPF( UI.qualCpf());
		int telefone = UI.qualTelefone();
		String endereco = UI.qualEndereco();
		pessoaFisica.alterar(aux,new PessoaFisica(nome,telefone, endereco, doc));
	}
}
