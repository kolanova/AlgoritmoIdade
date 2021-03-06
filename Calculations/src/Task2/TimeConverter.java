package Task2;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		final int HourCalculation = 60;
		final int MinutesCalculation = 60;

		try (//Metodo 1
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Write an amount of seconds you want:");
			int time = sc.nextInt();
			hours = time/3600;
			minutes = time/60;
			seconds = time%60;
			System.out.println("Method1 \n The time is: " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s) ");
			
			//Metodo 2
			hours = minutes/HourCalculation;
			minutes = time/MinutesCalculation;
			minutes -= hours *HourCalculation;
			seconds -= minutes*MinutesCalculation;
			System.out.println("Method2 \n The time is: " + hours + " hour(s) " + minutes + " minute(s) " + -seconds + " second(s) ");
			
			//Metodo 3
			hours = time/3600;
			minutes = time%3600;
			minutes = minutes/60;
			int newSeconds = time%3600;
			newSeconds = newSeconds%60;
			System.out.println("Method3 \n The time is: " + hours + " hour(s) " + minutes + " minute(s) " + newSeconds + " second(s) ");
			
			//Metodo 4 - n?o est? acabado
			int veryNewSeconds = time%60;
			hours = time%3600/3600;
			minutes = hours%60;
			System.out.println("Method4 \n The time is: " + hours + " hour(s) " + minutes + " minute(s) " + veryNewSeconds + " second(s) ");
		}
		}
}
