package com.pe.problem1;

/**
 * Problem 1: Multiples of 3 and 5.
 * 
 * @author MAGOCZ
 *
 */
public class Main {

	/**
	 * Glowna metoda w javie. Ona jest uruchamiana jako pierwsza. W sumie to
	 * jako jedyna sama jest uruchamiana przez jave. Wszystko co jest w niej
	 * napisane zostanie wykonane.
	 * 
	 * @param args
	 *            - argumenty ktore mozemy podac podczas jej uruchamiania
	 */
	public static void main(String[] args) {
		// tworzymy obiekt naszej klasy
		Multiples multiples = new Multiples();

		// zmianna do ktorej mamy liczyc
		int sumTo = 1000;
		// zmianna do ktorej zapisujemy summe
		int sum = 0;

		// petla przechodzaca przez wszystkie liczby od 0 az do 'sumTo'
		for (int i = 0; i <= sumTo; i++) {
			// sprawdzamy czy dana liczba jest wielokrotnoscia 3 lub 5
			if (multiples.isOf(i, 3) || multiples.isOf(i, 5)) {
				// jezeli tak, to dodajemy ja do sumy
				sum += i;
			}
		}

		// wyswietlamy sume w konsoli
		System.out.println(sum);

	}

}
