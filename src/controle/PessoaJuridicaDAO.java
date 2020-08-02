package controle;



import modelo.Pessoa;
import modelo.bd.PessoaJuridicaBD;

public class PessoaJuridicaDAO extends PessoaDAO {

	public PessoaJuridicaDAO() {
		dados = new PessoaJuridicaBD();
	}
	
	public  void adicionar(Pessoa pessoa) {
		dados.adicionarPessoa(pessoa);
	}
	
	public  void buscar(int posicao) {
		dados.buscarPessoa(posicao);
	}
	
	public  void remover(int posicao) {
		dados.removerPessoa(posicao);
	}
	
	public void alterar(int posicao, Pessoa pessoa){
		dados.alterarPessoa(posicao, pessoa);
	}
	
	public  void exibirAgenda() {
		dados.exibirAgenda();
	}
	
}
