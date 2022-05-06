package Ex33;

import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	
		Produto[] listaProduto = new Produto[10];
		
		for(int i=0; i < 2 ; i++) {
			Produto pd=new Produto();
			System.out.println("Qual o produto: ");
			pd.nome = ler.next();
			System.out.println("Qual o id: ");
			pd.id = ler.nextInt();
			System.out.println("Qual a descriçăo: ");
			pd.descricao = ler.next();
			System.out.println("Qual o valor: ");
			pd.valor = ler.nextDouble();
			System.out.println("Qual a quantidade: ");
			pd.quantidade = ler.nextInt();
			
			listaProduto[i] = pd;
		
		}
		
		for (Produto produto : listaProduto) {
		
			if(produto.valor<100) {
				System.out.printf("Nome: %s - Valor: %g", produto.nome, produto.valor);
			}
		}
		
		}
}
