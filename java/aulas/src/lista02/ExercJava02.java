package lista02;

import java.util.Scanner;

public class ExercJava02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, num3;
		
		System.out.println("Informe tr�s n�meros (separados pela tecla enter): ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		//System.out.printf("%d %d %d", num1, num2, num3);
		
		// num1 < num2 < num3
		// num1 < num3 < num2
		// num2 < num1 < num3
		// num2 < num3 < num1
		// num3 < num1 < num2
		// num3 < num2 < num1
		
		ler.close();
		
	}

}

/*
	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
*/
