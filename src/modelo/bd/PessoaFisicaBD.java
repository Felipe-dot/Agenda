package modelo.bd;

import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaFisicaBD extends BD {
	
	 ArrayList<Pessoa> pessoaFisica = new ArrayList<Pessoa>();
	
	
	@Override
	public void buscarPessoa(int posicao) {
		pessoaFisica.get(posicao);
	}

	@Override
	public void adicionarPessoa(Pessoa pessoa) {
		pessoaFisica.add(pessoa);
	}

	@Override
	public void removerPessoa(int posicao) {
		pessoaFisica.remove(posicao);
	}

	@Override
	public void alterarPessoa(int posicao, Pessoa pessoa) {
		pessoaFisica.set(posicao, pessoa);
	}
	

	@Override
	public void exibirAgenda() {
		int cont = 0;
		System.out.println("Agenda atual");
		System.out.println("Nome      Documento     Telefone     Endereço");
		for(Pessoa pessoa : pessoaFisica) {
			System.out.println("|" + cont + "|" + pessoa.getNome() + " "
					+ pessoa.getDocumento()  + " "
					+ pessoa.getTelefone() + " 	"
					+ pessoa.getEndereco());
			cont++;
		}
	
	}

}
