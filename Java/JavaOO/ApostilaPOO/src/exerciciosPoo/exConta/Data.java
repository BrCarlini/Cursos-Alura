package exerciciosPoo.exConta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
	
	// Data atual
	LocalDate dataAtual = LocalDate.now();
	
	
	// Define o formato para a data BR
	DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	// Formata a data atual no formato brasileiro
    String dataFormatada = dataAtual.format(formatoBr);
    
    String getDataAtual(){
    	return dataFormatada;
    }
	
}
