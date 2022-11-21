import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejemplo_FlujoDeBytes {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream imagen = new FileInputStream("C:/Users/brand/Desktop/imagen.jpg");
			
			int dato = 0;
			int contBites = 0;
			dato = imagen.read();
			
			while (dato != -1) {
				System.out.print("//"+dato);
				contBites++;
				dato = imagen.read();
			}
			System.out.println("El archivo tiene "+contBites+" bites");
			imagen.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("EL archivo no se ha encontrado.");
		}
	}
}