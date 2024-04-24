package br.com.magna.pizzaria;

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

public class Pizza {

	private Scanner scn = new Scanner(System.in);
	private String sabor1;
	private String sabor2;
	private double valorTotal = 0;
	private Map<String, Double> saboresEPrecos = new HashMap<>();
	public Map<String, Double> pizzasCriadas = new HashMap<>();
	

	public void criaPizza() {
		String opcaoMaisPizza;
		Cardapio.exibeCardapio();

		// Percorre a EnumSabor e adiciona o valor da descricao e preço no Map de
		// sabores
		for (EnumSabor sabor : EnumSabor.values()) {
			saboresEPrecos.put(sabor.getDescricao(), sabor.getPreco());
		}

		

		MyLogger.exibeInfo("Vamos montar sua pizza!");

		do {
			
			//Solicita sabor 1
			MyLogger.exibeSolicitacaoDeDado("Informe o 1° sabor(1/2): ");
			this.sabor1 = scn.nextLine().trim();
			

			//Solicita sabor 2
			MyLogger.exibeSolicitacaoDeDado("Informe o 2° sabor(2/2): ");
			this.sabor2 = scn.nextLine().trim();

			// Valida se os sabores informados estao no cardapio (saboresEPrecos)
			if (saboresEPrecos.containsKey(sabor1) && saboresEPrecos.containsKey(sabor2)) {
				
				Double precoAtualizado = Math.max(saboresEPrecos.get(sabor1), saboresEPrecos.get(sabor2));
				
				pizzasCriadas.put("ID: " + pizzasCriadas.size() + "/ " + sabor1 + " - " + sabor2, precoAtualizado);
				this.valorTotal += precoAtualizado;
				
			} else {
				MyLogger.exibeMsgDeErro("Sabor inválido.");
			}

			if (pizzasCriadas.size() > 0) {
				System.out.print("Deseja mais uma pizza ? [sim/nao] ");
				opcaoMaisPizza = scn.nextLine().trim().toLowerCase();

				if (opcaoMaisPizza.equals("sim")) {
					continue;
				} else {
					break;
				}

			}

			
		} while (true);

		

	}
	

	
	public void exibeCarrinho() {

		System.out.println("======================== CARRINHO ========================");
		for (String pizza : pizzasCriadas.keySet()) {
			Double preco = pizzasCriadas.get(pizza);
			System.out.println("Pizza --> " + pizza + ", Preço: R$" + preco);
		}
		
		System.out.printf("""
				-----------------------------------------------------------
                                                          TOTAL: R$%.2f
                                                          
                                                          			
                                                          						
                                                          												
				""", this.valorTotal);
		
		removeItemCarrinho();
		
	}
	
	public void removeItemCarrinho() {
		String opcaoRemoverItem;
		String itemASerRemovido;
		Double precoDoItemASerRemovido;
		
		MyLogger.exibeSolicitacaoDeDado("Deseja remover algum item do carrinho ?[sim/nao] ");
		opcaoRemoverItem = scn.nextLine().trim().toLowerCase();
		
		if(opcaoRemoverItem.equals("sim")) {
			try {
				
				MyLogger.exibeSolicitacaoDeDado("Informe o item na formatação (ID: n°ID/ 1°Sabor - 2°Sabor): ");
				
				itemASerRemovido = scn.nextLine().trim();
				
				
				// Preço do item a ser removido
				precoDoItemASerRemovido = pizzasCriadas.get(itemASerRemovido);
				
				
				// Subtraindo preço do item excluido do valor total
				this.valorTotal -= precoDoItemASerRemovido;
				
				
				// Removendo item
				pizzasCriadas.remove(itemASerRemovido);
				
				MyLogger.exibeInfo("Item " + itemASerRemovido + " removido do carrinho !");
				
			}catch(Exception e) {
				MyLogger.exibeMsgDeErro(e.getMessage() + " -> Informe o nome completo do item !");
			}
			
			
		}else {
			MyLogger.exibeInfo("Voltando para o Menu !");
		}
		
	}
	

}
