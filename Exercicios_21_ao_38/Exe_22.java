package Exercicios_21_ao_38;

import java.util.Scanner;

public class Exe_22 {
	public static void main(String[] args) {
Scanner ler=new Scanner(System.in);
		
	int n1, n2;
		
	System.out.printf("Digite o primeiro numero: ");
	n1=ler.nextInt();
	System.out.printf("Digite o segundo numero: ");
	n2=ler.nextInt();
	
	while(n1>n2) {
			
			System.out.printf("Digite novamente o segundo numero: ");
			n2=ler.nextInt();
		} 
	
		System.out.printf("Sistema encerrado" );
	}
	
}
	

		
		
		
	


