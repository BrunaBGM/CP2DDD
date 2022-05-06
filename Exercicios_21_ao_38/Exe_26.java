package Exercicios_21_ao_38;

import java.util.Scanner;

public class Exe_26 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);

		int x,a,b,i,t;
		
		boolean teste = true;
		
		System.out.printf("Digite um número positivo: ");
		x= ler.nextInt();
		
		while(teste==true) {	
			if(x>0) {
				System.out.printf("Digite o segundo valor: ");
				b= ler.nextInt();
				
				teste=false; 
		
				for(i=1; i<=10; i++) {
				t = x * i;
				
					System.out.printf(x + " X " + i + " = " + t + "\n" );
		 		}
		 	}else {
				System.out.printf("Erro! Digite um número positivo: ");
				x=ler.nextInt();
		}
		}
	}
}

