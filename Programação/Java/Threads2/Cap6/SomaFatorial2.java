import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SomaFatorial2 {

	public static void main(String[] args) throws Exception {
		BlockingQueue<Long> queue = new ArrayBlockingQueue<>(3);
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(new Fatorial2(16L, queue));
		ex.execute(new Fatorial2(7L, queue));
		ex.execute(new Fatorial2(12L, queue));

		Long total = queue.take() + queue.take() + queue.take();

		System.out.println(total);
	}
}