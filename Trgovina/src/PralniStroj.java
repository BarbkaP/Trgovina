/*
	Ime datoteke: 	PralniStroj.java
	Avtor:			Barbka Podbregar
*/

import java.util.*;
import java.util.stream.*;

// Deklariramo javni razred PralniStroj
public class PralniStroj {

	// Deklariramo zasebne lastnosti razreda PralniStroj
	private int zmogljivostPranja;	// v kg
	private boolean jePrizgan;
	private List<String> vsebina;
	
	// Javni konstruktor
	// Vhodni parametri: z - zmogljivost pranja
	// Potek/opis: ustvari nov objekt tipa PralniStroj
	// Vrne vrednost: nov objekt
	public PralniStroj(int z) {
	
		// Inicializiramo lastnosti objekta
		zmogljivostPranja = z;
		jePrizgan = false;
		vsebina = List.of();
		
		System.out.println("Ustvarjam nov objekt tipa PralniStroj z zmogljivostjo pranja " + zmogljivostPranja + ", je prižgan " + jePrizgan + " in vsebino " + vsebina + ".");
		
	}
	
	// Javni konstruktor
	// Vhodni parametri: z - zmogljivost pranja, p - ali je prižgan, v - vsebina
	// Potek/opis: ustvari nov objekt tipa PralniStroj
	// Vrne vrednost: nov objekt
	public PralniStroj(int z, boolean p, List<String> v) {
	
		// Inicializiramo lastnosti objekta
		zmogljivostPranja = z;
		jePrizgan = p;
		vsebina = v;
		
		System.out.println("Ustvarjam nov objekt tipa PralniStroj z zmogljivostjo pranja " + zmogljivostPranja + ", je prižgan " + jePrizgan + " in vsebino " + vsebina + ".");
		
	}
	
	// Javna metoda za prižiganje pralnega stroja
	// Vhodni parametri: /
	// Potek/opis: prižge pralni stroj v primeru da ni prazen
	// Vrne vrednost: ali je pralni stroj prižgan, v primeru da je prazen vrne napako
	public boolean prizgi() throws PrazenPralniStrojException {
	
		// Če pralni stroj kaj vsebuje
		if (vsebina.size() > 0) {
		
			System.out.println("Prižigam pralni stroj.");
		
			// Potem ga prižgemo
			jePrizgan = true;
		} else {
			// Sicer vrnemo napako
			throw new PrazenPralniStrojException();
		}
		
		// Vrnemo ali je pralni stroj prižgan ali ne
		return jePrizgan;
	}
	
	// Javna metoda, ki napolni pralni stroj
	// Vhodni parametri: t - teža oblačil, ki jih dodajamo v pralni stroj, v - oblačila, ki jih dodajamo v pralni stroj
	// Potek/opis: v primeru da je teža oblačil manjša kot je zmogljivost pranja pralnega stroja, napolni pralni stroj z v
	// Vrne vrednost: vsebino pralnega stroja, v primeru da je teža oblačil večja kot je zmogljivost pralnega stroja, vrne napako
	public List<String> napolni(int t, List<String> v) throws Exception {
	
		// Če je teža večja od zmogljivosti pranja pralnega stroja
		if (t > zmogljivostPranja) {
			// Vrnemo napako
			throw new Exception("Pralnega stroja ne moreš napolniti z večjo težjo kot je njegova zmogljivost!");
		} else {
		
			System.out.println("Polnim pralni stroj z " + v + ".");
		
			// Sicer ga napolnemo z podano vsebino
			vsebina = Stream.concat(vsebina.stream(), v.stream()).toList();
		}
		
		// Vrnemo kaj pralni stroj vsebuje
		return vsebina;
		
	}
	
	// Javna metoda za praznjenje pralnega stroja
	// Vhodni parametri: /
	// Potek/opis: izprazne pralni stroj v primeru da je ugasnjen, sicer pralni stroj ugasne in ga izprazne
	// Vrne vrednost: vsebino pralnega stroja
	public List<String> ugasniInIzprazni() {
	
		// Če je pralni stroj prižgan
		if (jePrizgan = true) {
		
			System.out.println("Ugašam pralni stroj.");
		
			// Ga ugasnemo
			jePrizgan = false;
		}
		
		// Shranimo vsebino, da jo vrnemo na koncu
		List<String> v = vsebina;
		
		System.out.println("Praznem pralni stroj: " + v + ".");
		
		// Izpraznemo vsebino
		vsebina = List.of();
		
		// Vrnemo izpraznjeno vsebino
		return vsebina;
		
	}
	
	// Javna getter metoda, ki vrne zmogljivost pranja
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: zmogljivost pranja
	public int getZmogljivostPranja() {
	
		return zmogljivostPranja;
	
	}
	
	// Javna getter metoda, ki vrne ali je pralni stroj prižgan ali ne
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: je prižgan ali ne
	public boolean getJePrizgan() {
	
		return jePrizgan;
	
	}
	
	// Javna getter metoda, ki vrne vsebino pralnega stroja
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: vsebina
	public List<String> getVsebina() {
	
		return vsebina;
	
	}

}
