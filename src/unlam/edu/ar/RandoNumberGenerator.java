package unlam.edu.ar;

public class RandoNumberGenerator {
	
	public Integer generate(){
		Integer valorAleatorio = (int)(Math.random() * 10);
		while(valorAleatorio <= 0 || valorAleatorio > 10){
			valorAleatorio = (int)(Math.random() * 10);
		}			
		return valorAleatorio;
	}
	
}
