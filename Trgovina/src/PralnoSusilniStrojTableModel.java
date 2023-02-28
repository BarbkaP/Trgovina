import javax.swing.table.*;

/**
 * 
 * @author barbka
 *
 */
public class PralnoSusilniStrojTableModel extends DefaultTableModel {

	/**
	 * Javni konstruktor
	 */
	public PralnoSusilniStrojTableModel() {
	
		// Kliče konstruktor nadrazreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Zmogljivost pranja");
		addColumn("Zmogljivost sušenja");
		
		// Ustvarimo naslovno vrstico
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Zmogljivost pranja", "Zmogljivost sušenja"};
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}

	/**
	 * Metoda, ki doda pralno sušilni stroj na seznam
	 * doda stroj na seznam in v tabelo
	 * 
	 * @param pss PralnoSusilniStroj
	 */
	public void addPralnoSusilniStroj(PralnoSusilniStroj pss) {
	
		// Ustvarimo naslovno vrstico
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {pss.getZmogljivostPranja(), pss.getZmogljivostSusenja()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}

	/**
	 * Metoda za spreminjanje vrednosti v tabeli
	 * 
	 * @param value nova vrednost s katero prepišemo prejšnjo
	 * @param row indeks vrstice, ki smo jo spremenili
	 * @param col indeks stolpca, ki smo ga spremenili
	 */
	public void setValueAt(Object value, int row, int col) {
	
		String lastnost = col == 0 ? "zmogljivost pranja" : "zmogljivost sušenja";
	
		System.out.println("Popravljam " + lastnost + " " + row + ". pralnega stroja na " + value.toString() + ".");
		super.setValueAt(value, row, col);
		
    }
	
}
