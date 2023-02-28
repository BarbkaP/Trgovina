import java.util.*;

/**
 * 
 * @author barbka
 *
 */
public class PralniStrojSenzor extends PralniStroj implements Senzor{

	// Deklariramo javne statične lastnosti razreda (materiali oblačil)
	public static String BOMBAZ = "bombaž";
	public static String CELULOZA = "celuloza";
	public static String SINTETIKA = "sintetika";
	public static String USNJE = "usnje";

	// Deklariramo zasebno statično lastnost razreda - mapo, ki določa kateri program pranja izbrati glede na večinski delež materiala iz katerega je perilo dodano v pralni stroj
	private Map<String, String> MAPPER_MATERIAL_NACIN_PRANJA = Map.of(
		BOMBAZ, "program za pranje bombaža",
		CELULOZA, "program za pranje celuloze",
		SINTETIKA, "program za pranje sintetike"
	);

	// Deklariramo zasebne lastnosti razreda PralniStrojSenzor
	private String vecinskiMaterial;
	private String nacinPranja;
	
	/**
	 * Javni konstruktor
	 * 
	 * @param z zmogljivost pranja
	 * @param m večinski material oblačil
	 */
	public PralniStrojSenzor(int z, String m) {
	
		// Pokličemo konstruktor nadrazreda - ustvarimo pralni stroj z zmogljivostjo pranja z
		super(z);
		
		// Inicializiramo še ostale lastnosti
		vecinskiMaterial = m;
		nacinPranja = "";
		
	}
	
	/**
	 * Javna metoda za automatsko izbiro pralnega programa
	 * izbere pralni program glede na večinski material oblačil v pralnem stroju
	 * 
	 * @return izbrani pralni program
	 * @throws NedefiniranPralniProgramException vrže napako v primeru da program za pranje ni definiran
	 */
	public String izberiPralniProgram() throws NedefiniranPralniProgramException {
	
		if (!MAPPER_MATERIAL_NACIN_PRANJA.containsKey(vecinskiMaterial)) {
		
			// Sicer vrnemo napako
			throw new NedefiniranPralniProgramException(vecinskiMaterial);
		
		} else {
		
			// Nastavi način pranja
			nacinPranja = MAPPER_MATERIAL_NACIN_PRANJA.get(vecinskiMaterial);
		
		}
		
		System.out.println("Način pranja je nastavljen na " + nacinPranja + ".");
		
		return nacinPranja;
	}

}
