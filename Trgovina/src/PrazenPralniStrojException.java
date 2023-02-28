/*
	Ime datoteke: 	PrazenPralniStrojException.java
	Avtor:			Barbka Podbregar
*/

// Deklariramo javni razred PrazenPralniStrojException, ki razširja Exception
public class PrazenPralniStrojException extends Exception {

	public PrazenPralniStrojException() {  
		super("Napolni pralni stroj preden ga prižgeš!");  
    }

}
