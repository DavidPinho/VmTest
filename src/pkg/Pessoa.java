package pkg;

public class Pessoa {
	
	private String nome;
	private int idade;
	public int peso;
	public int anos;
	
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

public void dMeth(){
  for (int i=0; i<10; i++) {
	if (i==1)
	  System.out.println(i);

	if (i==2) {
	  System.out.println(i);
	} else {
	  System.out.println("10");
	}
  }
}
	
	public void testPessoa(){
		
		
		setIdade(1);
		Pessoa p= new Pessoa();
		p.peso=3;
		Animal vaca = new Animal();
		vaca.idade=6;
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
