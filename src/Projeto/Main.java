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
			
		}
		else if ( idade < 5 || idade > 40 )
		{
			
		}
		else if (idade < 40 || idade > 5)
		{
			
		}
		
		leia.close();
	}

}
