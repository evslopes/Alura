import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SomaFatorial {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Long> f1 = ex.submit(new Fatorial(16L));
		Future<Long> f2 = ex.submit(new Fatorial(7L));
		Future<Long> f3 = ex.submit(new Fatorial(12L));

		Long total = f1.get() + f2.get() + f3.get();
		System.out.println("O total eh: " + total);
	}

}
