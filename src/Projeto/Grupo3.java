package Projeto;

public class Grupo3 extends Pessoas {

	public Grupo3(int idade, boolean comorb, boolean gravPuer) {
		super(idade, comorb, gravPuer);

	}

	public void dataVacinacao(int idade) {
		if (idade >= 5 && idade <= 40) {
			System.out.println("Seu m�s de vacina��o � Junho de 2021");
		} else {

			System.out.println("Entre em contato com a Secretaria de Sa�de de sua cidade.");

		}

	}

}
