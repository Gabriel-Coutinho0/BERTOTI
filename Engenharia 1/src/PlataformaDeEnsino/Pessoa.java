package PlataformaDeEnsino;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
		
		
	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
					
	}
	public String getNome(){
			return nome;
	}
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	public String getTelefone(){
		return telefone;
	}
		
	public void setTelefone(String novoTelefone){
		this.telefone=novoTelefone;
	}
		
	public String getEmail(){
		return email;
	}
		
	public void setEmail(String novoEmail){
		this.email=novoEmail;
	}
}

