package Exercicios_21_ao_38;

import java.util.Scanner;

public class Exe_21 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int  num;
		boolean teste=true;
				
		System.out.printf("Digite um número positivo: ");
		num= ler.nextInt();
		
		while(teste==true) {	
		 if(num >0) {

			 System.out.printf("Sistema encerrado.");
			 num=ler.nextInt();
			 
			 	teste=false; 
			 	
		 }else {
			 System.out.printf("Erro! Digite um número positivo: ");
			 num=ler.nextInt();
		 	}
		}
	}
}