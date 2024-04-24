package br.com.magna.pizzaria;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MyLogger {
	private final static Logger logger = Logger.getLogger(Recepcao.class.getName());
	
	
	
	static void exibeInfo(String msg) {
		logger.setLevel(Level.INFO);
		logger.info(msg);
	}
	
	
	static void exibeSolicitacaoDeDado(String msg){
		logger.setLevel(Level.WARNING);
		logger.warning(msg);
	}
	
	
	static void exibeMsgDeErro(String msg){
		logger.setLevel(Level.SEVERE);
		logger.severe(msg);
	}

	
	
}
