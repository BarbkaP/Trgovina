/*
	Ime datoteke: 	PralnoSusilniStrojTableModel.java
	Avtor:			Barbka Podbregar
*/

import javax.swing.table.*;

public class PralnoSusilniStrojTableModel extends DefaultTableModel {

	// Konstruktor
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
	
	// Metoda, ki doda pralno sušilni stroj na seznam
	// Vhodni parametri: pss - PralnoSusilniStroj
	// Potek/opis: Metoda, ki doda stroj na seznam in v tabelo
	// Vrne vrednost: /
	public void addPralnoSusilniStroj(PralnoSusilniStroj pss) {
	
		// Ustvarimo naslovno vrstico
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {pss.getZmogljivostPranja(), pss.getZmogljivostSusenja()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
	
	public void setValueAt(Object value, int row, int col) {
	
		String lastnost = col == 0 ? "zmogljivost pranja" : "zmogljivost sušenja";
	
		System.out.println("Popravljam " + lastnost + " " + row + ". pralnega stroja na " + value.toString() + ".");
		super.setValueAt(value, row, col);
		
		
    }
	
}
