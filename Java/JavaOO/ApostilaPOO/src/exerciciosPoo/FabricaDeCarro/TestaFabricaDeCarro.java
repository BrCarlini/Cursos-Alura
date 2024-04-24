package exerciciosPoo.FabricaDeCarro;

public class TestaFabricaDeCarro {

	public static void main(String[] args) {
		FabricaDeCarro fc1 = FabricaDeCarro.getInstancia();
		FabricaDeCarro fc2 = FabricaDeCarro.getInstancia();
		System.out.println(fc1);
		System.out.println(fc2);

		fc1.exibeMsg("Olá mundo!");
		fc2.exibeMsg("Olá Java");

	}

}
