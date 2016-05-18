import java.util.Properties;

public class Principal {

	Properties p1;
	Properties p2;
	Properties p3;

	public void lerPropriedades() {
		new Thread(new LeitorPropriedades(p1, "arquivo1.txt")).start();
		new Thread(new LeitorPropriedades(p2, "arquivo2.txt")).start();
		new Thread(new LeitorPropriedades(p3, "arquivo3.txt")).start();
	}
}
