package modelo.bd;

import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaJuridicaBD extends BD {

	ArrayList<Pessoa> pessoaJuridica = new ArrayList<Pessoa>();

	@Override
	public void buscarPessoa(int posicao) {
		pessoaJuridica.get(posicao);
	}

	@Override
	public void adicionarPessoa(Pessoa pessoa) {
		pessoaJuridica.add(pessoa);
	}

	@Override
	public void removerPessoa(int posicao) {
		pessoaJuridica.remove(posicao);
	}


	@Override
	public void alterarPessoa(int posicao, Pessoa pessoa) {
		pessoaJuridica.set(posicao, pessoa);
	}

	@Override
	public void exibirAgenda(ArrayList<Pessoa> pessoaJuridica) {
		int cont = 0;
		System.out.println("Agenda atual");
		System.out.println("Nome      Documento     Telefone     Endereço    Responsavel");
		for(Pessoa pessoa : pessoaJuridica) {
			System.out.println("|" + cont + "|" + pessoa.getNome() + " "
					+ pessoa.getDocumento() + " "
					+ pessoa.getTelefone() + " 	"
					+ pessoa.getEndereco() + "  "
					+ pessoa.getPessoa());
			cont++;
		}
	}


}
