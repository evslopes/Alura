import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorSocket {
	ServerSocket servidor = new ServerSocket (12345);

	while(true)

	{
		Socket cliente = servidor.accept();
		Thread t = new Thread(new TrataEmParalelo(cliente));
		t.start();
	}

}