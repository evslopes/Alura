import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TestaCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));

		cursos.stream().filter(c -> c.getAlunos() > 100).findAny();
		cursos.stream().filter(c -> c.getAlunos() > 100).findAny().ifPresent(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

		OptionalDouble media = cursos.stream().mapToInt(c -> c.getAlunos()).average();
		System.out.println(media);

	}

}
