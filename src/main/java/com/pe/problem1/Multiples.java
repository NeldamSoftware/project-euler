package com.pe.problem1;

public class Multiples {

	/**
	 * Metoda sprawdza czy podana liczba 'value' jest podzielna
	 * (wielokrotnoscia) 'of'.Pierwszy warunek sprawdza czy obie wprowadzone
	 * zmienne są równe zeru. Drugi warunek w nawiasach sprawdza czy podana
	 * liczba jest rozna od zera. Trzeci warunek sprawdza czy podana liczba
	 * 'value' jest podzielna przez 'of'.
	 * 
	 * 
	 * @param value
	 *            sprawdzana liczba
	 * @param of
	 *            dzielnik
	 * @return
	 */
	public boolean isOf(int value, int of) {
		return (value == 0 && of == 0) || ((value != 0) && (value % of == 0));
	}

}
