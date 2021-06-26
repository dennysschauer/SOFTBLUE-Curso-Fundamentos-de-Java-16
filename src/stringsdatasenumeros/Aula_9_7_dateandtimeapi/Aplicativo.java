package stringsdatasenumeros.Aula_9_7_dateandtimeapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicativo {

	public static void main(String[] args) {
		String dataNascimento = "17/04/1990 03:00";
		
		LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		Duration d = Duration.between(d1, d2);
		
		System.out.println("Horas: " + d.toHours());
		System.out.println("Dias: " + d.toDays());
		
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println("Meses: " + p.toTotalMonths());
		
		System.out.println("Semanas: " + ChronoUnit.WEEKS.between(d1, d2));
		System.out.println("Anos: " + ChronoUnit.YEARS.between(d1, d2));				

	}

}
