/**
 * 
 * @author barbka
 *
 */
public class PralnoSusilniStroj extends PralniStroj {

	// Deklariramo zasebne lastnosti razreda PralnoSusilniStroj
	private int zmogljivostSusenja;	// v kg
	private boolean susenje;
	
	/**
	 * Javni konstruktor
	 * 
	 * @param z zmogljivost pranja
	 * @param s zmogljivost sušenja
	 */
	public PralnoSusilniStroj(int z, int s) {
	
		// Pokličemo konstruktor nadrazreda - ustvarimo pralni stroj z zmogljivostjo pranja z
		super(z);
		
		// Inicializiramo še ostale lastnosti
		zmogljivostSusenja = s;
		susenje = false;
		
	}
	
	/**
	 * Javna metoda za sušenje perila
	 * nastavi pralni stroj v način sušenja in ga prižge
	 * 
	 * @return true - če je pralni stroj prižgan, false - če pralni stroj ni prižgan
	 * @throws Exception vrže napako v primeru, da je pralni stroj prazen
	 */
	public boolean posusi() throws Exception {
	
		System.out.println("Nastavljam pralno sušilni stroj v način sušenja.");
	
		// Nastavi pralni stroj v način sušenja
		susenje = true;
		
		// Prižgi pralni stroj
		return prizgi();
		
	}
	
	/**
	 * Javna getter metoda, ki vrne zmogljivost sušenja
	 * 
	 * @return zmogljivost sušenja
	 */
	public int getZmogljivostSusenja() {
	
		return zmogljivostSusenja;
	
	}

}
