package Exercicios_21_ao_38;

import java.util.Scanner;

public class Exe_23 {
	
public static void main(String[] args) {
	
	boolean teste = false;
	Scanner ler=new Scanner(System.in);
	
	System.out.printf("Qual seu sexo? \n" + "Digite 'F' para feminino e 'M' para masculino: ");
	char genero = ler.next().charAt(0);
	
	while(teste == false) {
		if((genero == 'M') || (genero == 'm') || (genero == 'F') || (genero == 'f')) {
		
			teste = true;

			System.out.printf("Sistema encerrado");		
		}
		else {

			System.out.printf("Digite novamente: ");
			genero = ler.next().charAt(0);
		}
	}
}
}
