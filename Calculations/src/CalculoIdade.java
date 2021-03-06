import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a ano do seu nascimento");
		
		int ano = s.nextInt();
		
		System.out.println("Digite o m?s do seu nascimento");
		int mes = s.nextInt();
				
		System.out.println("Digite o dia do seu nascimento");
		int dia = s.nextInt();
		
		
		LocalDate hoje = LocalDate.now();
		LocalDate anniversario = LocalDate.of(ano, mes, dia);
		
		int anodif = Period.between(anniversario, hoje).getYears();
		int mesdif = Period.between(anniversario, hoje).getMonths();
		int diadif = Period.between(anniversario, hoje).getDays();
		
		int anodif2 = anodif*365;
		int mesdif2 = mesdif*12;
		int diasdaidade= anodif2 + mesdif2 + diadif;
		System.out.println("Voc? tem " + diasdaidade + " dias da idade");
				
	}
	
}
