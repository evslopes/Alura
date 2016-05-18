import java.util.concurrent.BlockingQueue;

public class Fatorial2 implements Runnable {
	private Long numero;
	private BlockingQueue<Long> queue;

	public Fatorial2(Long numero, BlockingQueue<Long> queue) {
		this.numero = numero;
		this.queue = queue;
	}

	@Override
	public void run() {
		Long resultado = 1L;
		for (Long i = numero; i > 1; i--) {
			resultado *= i;
		}
		try {
			queue.put(resultado);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}