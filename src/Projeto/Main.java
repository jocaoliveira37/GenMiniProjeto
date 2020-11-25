package Projeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);		
		System.out.println("Qual a idade: ");
		int idade = leia.nextInt();
		System.out.println("Possui alguma comorbidade: ");
		boolean comorb = leia.nextBoolean();
		System.out.println("Está grávida ou puérpera ?");
		boolean gravPuer = leia.nextBoolean();
		
		if (comorb == true || gravPuer == true || idade > 65)
		{
			Grupo1 grupo1 = new Grupo1(idade, comorb, gravPuer);
			System.out.println(grupo1.chamarData());
		}
		else if ( idade < 5 || idade > 40 )
		{
			Grupo2 grupo2 = new Grupo2(idade, comorb, gravPuer);
			System.out.println(grupo2.chamarData());
		}
		else if (idade < 40 || idade > 5)
		{
			Grupo3 grupo3 = new Grupo3(idade, comorb, gravPuer);
			grupo3.dataVacinacao(idade);
		}
		
		leia.close();
	}

}
