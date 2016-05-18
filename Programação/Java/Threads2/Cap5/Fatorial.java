import java.util.concurrent.Callable;

public class Fatorial implements Callable<Long> {
	private Long numero;

	public Fatorial(Long numero) {

		this.numero = numero;
	}

	@Override
	public Long call() throws Exception {
		Long resultado = 1L;
		for (Long i = numero; i > 1; i--) {
			resultado *= i;
		}
		return resultado;
	}

}
