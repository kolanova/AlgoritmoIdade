import java.time.LocalDate;
import java.time.Period;

public class CalculoIdade {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate anniversario = LocalDate.of(0, 0, 0);
		Period.between(anniversario, hoje).getYears();
	}
}
