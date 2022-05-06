package Exercicios_21_ao_38;

import java.util.Scanner;

public class Exe_25 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int num,i,t;
		boolean teste=false;
				
		System.out.printf("Digite um número positivo: ");
		num= ler.nextInt();
		
		while(teste==false) {
		 if(num >0) {
			
				teste=true;
			}
			else {
				
				System.out.printf("Erro! Digite um número positivo: ");
				num=ler.nextInt();
				
			}
		 	for(i=1; i<=10; i++) {
			if(num<=0)
				break;
			
		  t= num*i;
		  System.out.printf("\n%d X %d = %d", num,i,t);
	  	
	  }
	}
  }
}
