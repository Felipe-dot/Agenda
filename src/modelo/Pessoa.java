package modelo;

public abstract class Pessoa {
	private int telefone;
	private String endereco,nome;
	private Documento documento;
	private Pessoa pessoa;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDocumento() {
		return documento.numero;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa(String nome,int telefone, String endereco, Documento documento, Pessoa pessoa) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
		this.setDocumento(documento);
		this.setPessoa( pessoa);
	}

	public Pessoa(String nome ,int telefone, String endereco, Documento documento) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
		this.setDocumento(documento);
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
