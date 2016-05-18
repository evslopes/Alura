public class IncrementaVariavel implements Runnable {

	private volatile static double total = 1;

	public static void main(String[] args) {

		new Thread(new IncrementaVariavel()).start();

		new Thread(new IncrementaVariavel()).start();

		new Thread(new IncrementaVariavel()).start();

		new Thread(new IncrementaVariavel()).start();

		new Thread(new IncrementaVariavel()).start();

	}

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {

			total = total * 1.5;

			System.out.println(total);

		}

	}

}