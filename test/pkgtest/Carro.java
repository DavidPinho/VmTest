package pkgtest;

import pkg.Pessoa;

public class Carro {

	private Pessoa pe;

	public Pessoa getPe() {
		return pe;
	}

	public void setPe(Pessoa pe) {
		this.pe = pe;
	}
	
	public String tesP(Pessoa p){
		return p.getNome();
	}
	
}
