package Ex32;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	
	Cliente[] listaCliente = new Cliente[5];
	
	for (int i=0; i<listaCliente.length; i++) {
		Cliente cl =new Cliente();
		
		System.out.println("Qual o ID: ");
		cl.id= ler.nextInt();
		System.out.println("Qual o nome do cliente: ");
		cl.nome= ler.next();
		System.out.println("Qual a idade: ");
		cl.idade= ler.nextInt();
		System.out.println("Qual o email: ");
		cl.email = ler.next();
		
		
		listaCliente[i] = cl;
	
	}
		System.out.printf("Clientes maiores de idade: ");
	for (int i=0; i<listaCliente.length; i++) {
		
		if(listaCliente[i].idade>18) {
			
		System.out.printf("\n" + listaCliente[i].nome + " " + listaCliente[i].idade + " anos");
	}
		
	}
	
	}
}
