/*
	Ime datoteke: 	NedefiniranPralniProgramException.java
	Avtor:			Barbka Podbregar
*/

// Deklariramo javni razred NedefiniranPralniProgramException, ki razširja Exception
public class NedefiniranPralniProgramException extends Exception {

	public NedefiniranPralniProgramException(String vecinskiMaterial) {  
		super("Način pranja za material " + vecinskiMaterial + " ni definiran!");  
    }

}
