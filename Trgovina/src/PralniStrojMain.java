import java.io.*;

import java.util.*;

/**
 * 
 * @author barbka
 *
 */
public class PralniStrojMain {

	/**
	 * Statična lastnost za vnos iz konzole
	 */
	private static BufferedReader in;
	
	/**
	 * Statična lastnost s seznamom pralnih strojev
	 */
	private static ArrayList<PralniStroj> pralniStroji;

	/**
	 * Javna statična metoda, ki se zažene ob zagonu programa
	 * 
	 * @param args Argumenti s katerimi kličemo program ob zagonu
	 */
	public static void main(String[] args) {
	
		// Inicializiramo statično lastnost za vnos iz konzole
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// Deklariramo objekte tipa PralniStroj
		PralniStroj pralniStroj8kg = new PralniStroj(8);
		PralniStroj pralniStroj6kg = new PralniStroj(6);
		
		// Spremenljivka z pralno zmogljivostjo stroja
		int zmogljivost = 0;
		// Skušamo vprašati uporabnika, pralni stroj kakšne zmogljivosti naj ustvarimo
		try {
			System.out.print("Vnesi pralno zmogljivost stroja: ");
			zmogljivost = Integer.parseInt(in.readLine());
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri vnosu zmogljivosti pralnega stroja: " + e);
		}
		
		PralniStroj prizganPralniStroj = new PralniStroj(zmogljivost, true, List.of("kavbojke", "majica", "nogavice"));
		
		// Pralni stroj zmogljivosti pranja 8 kg skušamo napolniti
		try {
			pralniStroj8kg.prizgi();
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri prižiganju pralnega stroja: " + e);
			System.out.println("Pralni stroj ni bil prižgan!");
		}
		
		// Pralni stroj zmogljivosti pranja 8 kg poskusimo napolniti
		try {
			pralniStroj8kg.napolni(10, List.of("velika zelena brisača", "mala modra brisača", "bela kuhinjska krpa"));
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri polnjenju in prižiganju pralnega stroja: " + e);
			System.out.println("Pralni stroj ni bil napolnjen in prižgan!");
		}
		
		// Pralni stroj zmogljivosti pranja 6 kg poskusimo napolniti in prižgati
		try {
			pralniStroj6kg.napolni(4, List.of("velika zelena brisača", "mala modra brisača", "bela kuhinjska krpa"));
			pralniStroj6kg.prizgi();
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri polnjenju in prižiganju pralnega stroja: " + e);
			System.out.println("Pralni stroj ni bil napolnjen in prižgan!");
		}
		
		// Ugasnemo in izpraznimo prižgan pralni stroj
		prizganPralniStroj.ugasniInIzprazni();
		
		// Inicializiramo seznam pralnih strojev
		pralniStroji = new ArrayList<PralniStroj>();
		
		// Pralne stroje dodamo na seznam
		pralniStroji.add(pralniStroj8kg);
		pralniStroji.add(pralniStroj6kg);
		pralniStroji.add(prizganPralniStroj);
		
		while (true) {
		
			// Skušamo vprašati uporabnika, pralni stroj kakšne zmogljivosti naj ustvarimo
			try {
				System.out.print("Vnesi pralno zmogljivost stroja, ki naj ga vnesem v seznam: ");
				// Shranimo vnos uporabnika
				String vnos = in.readLine();
				System.out.println("Vnos \"" + vnos + "\".");
				// Če je vnos prazen
				if (vnos.equals("")) {
					// Zapustimo zanko while
					break;
				} else {
					// Spremenljivka z pralno zmogljivostjo stroja
					int z = Integer.parseInt(vnos);
					// Dodamo pralni stroj v seznam
					pralniStroji.add(new PralniStroj(z));
				}
			}
			// Če je bila sporočena izjema
			catch(Exception e) {
				System.out.println("Napaka pri vnosu zmogljivosti pralnega stroja: " + e);
			}
			
		}
		
		
		// Preverimo koliko pralnih strojev je v seznamu
		System.out.println("Na seznamu je " + pralniStroji.size() + " pralnih strojev.");
		
		// Izpišemo vse pralne stroje v seznamu
		for (int c=0; c<pralniStroji.size(); c++) {
		
			System.out.println(c + ". pralni stroj: " + pralniStroji.get(c).getZmogljivostPranja() + ", prižgan: " + pralniStroji.get(c).getJePrizgan() + ", vsebina: " + pralniStroji.get(c).getVsebina() + ".");
		
		}
		
		// Spremenljivka z zmogljivostjo susenja stroja
		int zmogljivostSusenja = 0;
		// Skušamo vprašati uporabnika, pralni stroj kakšne zmogljivosti susenja naj ustvarimo
		try {
			System.out.print("Vnesi sušilno zmogljivost stroja: ");
			zmogljivostSusenja = Integer.parseInt(in.readLine());
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri vnosu sušilne zmogljivosti pralnega stroja: " + e);
		}
		
		// Deklariramo objekt tipa PralnoSusilniStroj
		PralnoSusilniStroj pralnoSusilniStroj = new PralnoSusilniStroj(8, zmogljivostSusenja);
		// Pralno sušilni stroj poskusimo napolniti
		try {
			pralnoSusilniStroj.napolni(6, List.of("mala rdeča brisača", "velika bela brisača", "siva kuhinjska krpa"));
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri polnjenju pralno sušilnega stroja: " + e);
			System.out.println("Pralno sušilni stroj ni bil napolnjen!");
		}
		// Poskusimo posušiti perilo
		try {
			pralnoSusilniStroj.posusi();
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri sušenju perila: " + e);
			System.out.println("Perilo v pralno sušilnem stroju ni bilo posušeno!");
		}
		
		// Deklariramo objekt tipa PralniStrojSenzor
		PralniStrojSenzor pralniStrojSenzor = new PralniStrojSenzor(8, PralniStrojSenzor.BOMBAZ);
		// Za pralni stroj senzor poskusimo izbrati pralni program
		try {
			pralniStrojSenzor.izberiPralniProgram();
		}
		// Če je bila sporočena izjema
		catch(NedefiniranPralniProgramException e) {
			System.out.println("Napaka pri izbiri pralnega programa: " + e);
			System.out.println("Pralni program ni bil izbran!");
		}
		
		// Spremenljivka z večinskim materialom oblačil v pralnem stroju
		String material = "";
		// Skušamo vprašati uporabnika, kateri je večinski material oblačil v pralnem stroju
		try {
			System.out.print("Vnesi večinski material perila v pralnem stroju: ");
			material = in.readLine();
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri vnosu materiala: " + e);
		}
		
		// Deklariramo objekt tipa PralniStrojSenzor
		PralniStrojSenzor pralniStrojSenzorUsnje = new PralniStrojSenzor(8, material);
		// Za pralni stroj senzor poskusimo izbrati pralni program
		try {
			pralniStrojSenzorUsnje.izberiPralniProgram();
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri izbiri pralnega programa: " + e);
			System.out.println("Pralni program ni bil izbran!");
		}
		
	}

}
