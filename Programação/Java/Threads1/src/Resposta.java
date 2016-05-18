
public class Resposta {
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("resposta");

			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
