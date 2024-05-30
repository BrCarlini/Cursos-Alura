package exerciciosPoo.FabricaDeCarro;


public class FabricaDeCarro {
	private static FabricaDeCarro instancia;
	
	private FabricaDeCarro() {
		
	}
	
	static FabricaDeCarro getInstancia() {
		
		if(instancia == null) {
			instancia = new FabricaDeCarro();
		}
		
		
		return instancia;
	}
	
	
	void exibeMsg(String msg) {
		System.out.println(msg);
	}
	
	

}
