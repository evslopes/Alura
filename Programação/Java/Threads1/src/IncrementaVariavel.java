public class IncrementaVariavel implements Runnable {

	private static int total = 0;
	private static int incremento = 1;

	public static void main(String[] args) {
		new Thread(new IncrementaVariavel()).start();
		new Thread(new IncrementaVariavel()).start();
		new Thread(new IncrementaVariavel()).start();
		new Thread(new IncrementaVariavel()).start();
		new Thread(new IncrementaVariavel()).start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized (IncrementaVariavel.class) {
				total += incremento;
				incremento++;
				System.out.println(total + "-" + incremento);
			}
		}
	}
}