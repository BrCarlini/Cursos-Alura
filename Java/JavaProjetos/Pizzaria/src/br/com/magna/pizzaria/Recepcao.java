package br.com.magna.pizzaria;

import java.util.Scanner;

public class Recepcao {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Pizza pizza = new Pizza();
		Cliente user;
		int opcao;
		
		
		System.out.println("BEM-VINDO A PIZZARIA CARLINI");
		
		// Solicita o nome e atribui ao nome do Obj user
		MyLogger.exibeSolicitacaoDeDado("Informe seu nome: ");
		String entradaNome = scn.nextLine();
		
		
		// Solicita o telefone e atribui ao telefone do Obj user
		MyLogger.exibeSolicitacaoDeDado("Informe seu telefone: ");
		String entradaTelefone = scn.nextLine();
		
		user = new Cliente(entradaNome, entradaTelefone);
		
		
		
		
		do {
			 
			System.out.println("==================== MENU ====================");
			System.out.printf("Escolha alguma das opções a seguir %s:\n", user.getNome());
			System.out.printf("""
					1 - Fazer Pedido
					2 - Carrinho(%d)
					3 - Sair
					
					>>>
					""", pizza.pizzasCriadas.size());
			
			opcao = scn.nextInt();
			
			
			
			switch(opcao) {
			
			case 1:
				pizza.criaPizza();
				
				break;
			case 2:
				pizza.exibeCarrinho();
				break;
			case 3:
				System.out.println("Volte Sempre " + user.getNome() + " :)");
				break;
			default:
				System.out.println("opção invalida");
			
			}
			
			
		}while(opcao != 3);
		scn.close();
		
	}

}
