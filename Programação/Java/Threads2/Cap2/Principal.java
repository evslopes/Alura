import java.util.Properties;

public class Principal implements Thread.UncaughtExceptionHandler {

	Properties p1;
	Properties p2;
	Properties p3;

	public void lerPropriedades() {
		lerPropriedadesEmParalelo(p1, "arquivo1.txt");
		lerPropriedadesEmParalelo(p2, "arquivo1.txt");
		lerPropriedadesEmParalelo(p3, "arquivo1.txt");
	}

	private void lerPropriedadesEmParalelo(Properties p, String nomeArquivo) {
		LeitorPropriedades leitor1 = new LeitorPropriedades(p, nomeArquivo);
		Thread t1 = new Thread(leitor1);
		t1.setUncaughtExceptionHandler(this);
		t1.start();
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Exceção " + e + " capturada na Thread " + t.getId());
	}
}