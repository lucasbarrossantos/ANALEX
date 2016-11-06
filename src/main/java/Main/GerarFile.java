package Main;

import java.io.File;

/**
 * Devolve o endereco onde está o arquivo de Entrada.
 */
public class GerarFile {
	private String vfinal;
	
	public GerarFile() {
		
	}
	
	public String File(){
		File file = new File("").getAbsoluteFile();
		vfinal = file.toString().replace("\\", "//") + "\\src\\main\\java\\Entradas\\Entrada.txt".replace("\\", "/");
		return vfinal;
	}
}
