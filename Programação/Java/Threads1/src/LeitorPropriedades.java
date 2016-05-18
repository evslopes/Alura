import java.io.FileReader;
import java.util.Properties;

public class LeitorPropriedades implements Runnable {

	private Properties p;
	private String nomeArquivo;

	public LeitorPropriedades(Properties p, String nomeArquivo) {
		this.p = p;
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void run() {
		try {
			p.load(new FileReader(nomeArquivo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}