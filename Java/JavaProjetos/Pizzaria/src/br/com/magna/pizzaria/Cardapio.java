package br.com.magna.pizzaria;

import java.util.Scanner;

public class Cardapio {
	
	Scanner scn = new Scanner(System.in);
	
	
	
	static public void exibeCardapio() {
		
		for(EnumSabor sabor: EnumSabor.values()) {
			MyLogger.exibeInfo(sabor.getDescricao() + " - " + "R$" + sabor.getPreco());
		}
	}
	


}
