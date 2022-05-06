package Exercicios_21_ao_38;

import java.util.Scanner;

public class Exe_24 {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		int num,i,t;
		
		System.out.printf("Digite um numero: ");
		num=ler.nextInt();
		
		for(i=1; i<=10; i++) {
			t = num * i;
			System.out.printf(num + " X " + i + " = " + t + "\n" );
		}
		
			
	}
		
}

