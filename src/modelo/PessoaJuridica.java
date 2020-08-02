package modelo;

public class PessoaJuridica extends Pessoa {

	Pessoa pessoaFisica;
	
	public PessoaJuridica(String nome, int telefone, String endereco, Documento documento, Pessoa pessoaFisica) {
		super(nome,telefone, endereco, documento, pessoaFisica);
	}

}
