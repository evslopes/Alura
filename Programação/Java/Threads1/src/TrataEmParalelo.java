import java.net.Socket;
import java.util.Scanner;

public class TrataEmParalelo implements Runnable {
	public Socket cliente;

	public TrataEmParalelo(Socket cliente) {
		this.cliente = cliente;
	}

	@Override
	public void run() {
		Scanner s = new Scanner(this.cliente.getInputStream());
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}
}