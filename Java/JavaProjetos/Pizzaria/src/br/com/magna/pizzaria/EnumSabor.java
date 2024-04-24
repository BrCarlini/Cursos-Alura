package br.com.magna.pizzaria;

public enum EnumSabor {

	ALHOEOLEO("Alho e Óleo", 29.90), ATUM("Atum", 39.90), BACON("Bacon", 39.90),
	BANANACOMCANELA("Banana com Canela", 34.90), BROCOLISCOMBACON("Brocolis com Bacon", 39.90),
	CALABRESA("Calabresa", 29.90), CATUPIRY("Catupiry", 34.90), CHOCOLATECOMMORANGO("Chocolate com Morango", 34.90),
	DOCEDELEITECOMCOCO("Doce de Leite com Coco", 34.90), FRANGOCOMCATUPIRY("Frango com Catupiry", 39.90),
	MARGHERITA("Margherita", 34.90), MUCARELA("Muçarela", 29.90), NAPOLITANA("Napolitana", 34.90),
	PALMITO("Palmito", 34.90), PARMESAO("Parmesão", 29.90), PEPPERONI("Pepperoni", 34.90),
	PORTUGUESA("Portuguesa", 29.90), QUATROQUEIJOS("Quatro Queijos", 34.90),
	RUCULACOMTOMATESECO("Rúcula com Tomate Seco", 39.90), SALMAOCOMCREAMCHEESE("Salmão com Cream Cheese", 49.90);

	private String descricao;
	private double preco;

	EnumSabor(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	

}
