
public class Incrementador implements Runnable {

	public boolean executou = false;

	@Override
	public void run() {
		synchronized (this) {
			Sincronizacao.variavel += 10;
			executou = true;
			this.notify();
		}

	}

}
