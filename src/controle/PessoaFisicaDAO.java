package controle;

import modelo.Pessoa;
import modelo.bd.PessoaFisicaBD;

public class PessoaFisicaDAO extends PessoaDAO {

	public PessoaFisicaDAO() {
		dados = new PessoaFisicaBD();
	}

	public void adicionar(Pessoa pessoa) {
		dados.adicionarPessoa(pessoa);
	}

	public  void buscar(int posicao) {
		dados.buscarPessoa(posicao);
	}

	public void remover(int posicao) {
		dados.removerPessoa(0);
	}

	public  void alterar(int posicao,Pessoa pessoa) {
		dados.alterarPessoa(posicao, pessoa);
	}
	
	public  void exibirAgenda() {
		dados.exibirAgenda();
	}


}
