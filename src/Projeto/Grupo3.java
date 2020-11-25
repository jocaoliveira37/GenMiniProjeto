package Projeto;

public class Grupo3 extends Pessoas {

	public Grupo3(int idade, boolean comorb, boolean gravPuer) {
		super(idade, comorb, gravPuer);

	}

	public String dataVacinacao(int idade) {
		if (idade >= 5 && idade <= 40) {
			System.out.println("Seu mês de vacinação é Junho de 2021");
			return null;
		} else {

			System.out.println("Entre em contato com a Secretaria de Saúde de sua cidade.");
			return null;
		}

	}

}
