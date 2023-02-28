/*
	Ime datoteke: 	PralnoSusilniStroj.java
	Avtor:			Barbka Podbregar
*/

// Deklariramo javni razred PralnoSusilniStroj
public class PralnoSusilniStroj extends PralniStroj {

	// Deklariramo zasebne lastnosti razreda PralnoSusilniStroj
	private int zmogljivostSusenja;	// v kg
	private boolean susenje;
		
	// Javni konstruktor
	// Vhodni parametri: z - zmogljivost pranja, s - zmogljivost sušenja
	// Potek/opis: ustvari nov objekt tipa PralnoSusilniStroj
	// Vrne vrednost: nov objekt
	public PralnoSusilniStroj(int z, int s) {
	
		// Pokličemo konstruktor nadrazreda - ustvarimo pralni stroj z zmogljivostjo pranja z
		super(z);
		
		// Inicializiramo še ostale lastnosti
		zmogljivostSusenja = s;
		susenje = false;
		
	}

	
	// Javna metoda za sušenje perila
	// Vhodni parametri: /
	// Potek/opis: nastavi pralni stroj v način sušenja in ga prižge
	// Vrne vrednost: ali je pralni stroj prižgan, v primeru da je prazen vrne napako
	public boolean posusi() throws Exception {
	
		System.out.println("Nastavljam pralno sušilni stroj v način sušenja.");
	
		// Nastavi pralni stroj v način sušenja
		susenje = true;
		
		// Prižgi pralni stroj
		return prizgi();
		
	}
	
		// Javna getter metoda, ki vrne zmogljivost sušenja
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: zmogljivost sušenja
	public int getZmogljivostSusenja() {
	
		return zmogljivostSusenja;
	
	}

}
