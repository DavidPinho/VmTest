package pkg;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void testPessoa(){
		
		Animal vaca = new Animal();
		vaca.setRaca("oi");
		
		idade=10;
		nome="j";
		
		for(int i =0;i<5;i++){
			if((i<2 || i>4) && idade<90)
				System.out.println("good");			
		}
		
		nome = nome+"h";
	}
	

	
}
