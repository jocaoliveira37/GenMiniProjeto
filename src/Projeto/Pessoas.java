package Projeto;

public class Pessoas {
	private int Idade;
	private boolean comorb;
	private boolean gravPuer;
	
	public Pessoas(int idade, boolean comorb, boolean gravPuer) {
		super();
		this.Idade = idade;
		this.comorb = comorb;
		this.gravPuer = gravPuer;
	}
	public Pessoas() {
		
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public boolean isComorb() {
		return comorb;
	}

	public void setComorb(boolean comorb) {
		this.comorb = comorb;
	}

	public boolean isGravPuer() {
		return gravPuer;
	}

	public void setGravPuer(boolean gravPuer) {
		this.gravPuer = gravPuer;
	}
	
	/*Teste Git*/
	
}
