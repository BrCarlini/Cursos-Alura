package bytebank_heranca;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Bruno");
		g1.getSalario();
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
		
		
		
	}

}
