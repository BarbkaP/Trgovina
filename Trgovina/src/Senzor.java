/*
	Ime datoteke: 	Senzor.java
	Avtor:			Barbka Podbregar
*/

// Deklariramo javni vmesnik
public interface Senzor {
	
	// Deklariramo javno metodO, ki izbere pralni program
	// Vhodni parametri: /
	// Potek/opis: izbere pralni program glede na večinski material oblačil v pralnem stroju
	// Vrne vrednost: izbrani pralni program, vrne napako v primeru da program za pranje ni definiran
	public String izberiPralniProgram() throws NedefiniranPralniProgramException;

}
