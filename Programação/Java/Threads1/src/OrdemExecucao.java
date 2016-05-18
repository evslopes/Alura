
public class OrdemExecucao implements Runnable {

	public static void main(String[] args) {
		new Thread(new OrdemExecucao()).start();
		new Thread(new OrdemExecucao()).start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getId() + "' " + i);
		}
	}

}
