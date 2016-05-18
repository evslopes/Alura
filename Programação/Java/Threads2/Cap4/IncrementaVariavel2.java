import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IncrementaVariavel2 implements Runnable {
	private static Integer total = 0;

	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			ex.execute(new IncrementaVariavel2());
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (total) {
				total++;
				System.out.println(total);
			}
		}

	}

}
