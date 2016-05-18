import java.util.function.Consumer;

class ConsumidorDeString implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);
	}
}