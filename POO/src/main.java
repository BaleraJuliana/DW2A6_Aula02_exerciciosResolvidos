import java.util.LinkedList;

public class main {
	
	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro("toto"); 
		
		
		
		System.out.println("Nome: "+toto.getNome());
		System.out.println("Peso: "+toto.getPeso());
		System.out.println("Idade: "+toto.getIdade());
		
		toto.comer();
		toto.comer();
		toto.fazerAniversario();
		
		System.out.println("Peso: "+toto.getPeso());
		System.out.println("Idade: "+toto.getIdade());
		
		System.out.println("----------------------------");
		
		Gato tom = new Gato("tom");
		
		tom.comer();
		tom.fazerAniversario();
		
		System.out.println("Nome: "+tom.getNome());
		System.out.println("Idade: "+tom.getIdade());
		System.out.println("Peso: "+tom.getPeso());
		
		tom.emitirSom();
		toto.emitirSom();
		
		LinkedList<Animal> lista = new LinkedList<Animal>();
		
		lista.add(toto);
		lista.add(tom);
		
		
		
		
		
		
		
		
	}
	

}
