
public abstract class Animal {
	
	private int idade;
	private String nome;
	private int peso;
	
	public Animal(String nome) {
		idade = 0;
		peso = 0;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void comer() {
		
		peso = peso + 1;
		
	}
	
	public void fazerAniversario() {
		
		idade = idade + 1;
		
	}
	
	
	
	

}
