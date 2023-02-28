/*
	Ime datoteke: 	Trgovina.java
	Avtor:			Barbka Podbregar
	Vhodni podatki: /
	Opis: 			Aplikacija z grafičnim uporabniškim vmesnikom za delo z pralnimi stroji
	Izhodni podatki:Okno grafičnega uporabniškega vmesnika
*/

// Uvozimo pakete za delo z GUI
import javax.swing.*;

// Uvozimo paket za delo z dogodki
import java.awt.event.*;

// Deklariramo javni razred
public class Trgovina extends JFrame implements ActionListener {

	// Deklariramo zasebne lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField zmogljivostPranjaPolje, zmogljivostSusenjaPolje;
	private JTable tabela;
	private PralnoSusilniStrojTableModel modelTabele;

	// Deklariramo javno statično metodo, ki se izvede ob zagonu programa
	// Vhodni parametri: vhodni parametri iz konzole
	// Potek/opis: ustvari novo okno
	// Vrne vrednost: /
	public static void main(String[] args) {
	
		Trgovina t = new Trgovina("Trgovina s pralno sušilnimi stroji");
		
	}
	
	// Javni konstruktor
	// Vhodni parametri: n - naslov okna
	// Potek/opis: ustvari nov objekt tipa Miza
	// Vrne vrednost: nov objekt
	public Trgovina(String n) {
		
		// Kličemo konstruktor nadrazreda
		super(n);
		
		// Inicializiramo zasebne lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj stroj");
		zmogljivostPranjaPolje = new JTextField(4);
		zmogljivostSusenjaPolje = new JTextField(4);
		modelTabele = new PralnoSusilniStrojTableModel();
		tabela = new JTable(modelTabele);
		
		// Površino damo na mizo
		add(povrsina);
		
		// Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);
		
		// Dodamo gumb, vnosna polja in tabelo na površino
		povrsina.add(new JLabel("Zmogljivost pranja:"));
		povrsina.add(zmogljivostPranjaPolje);
		povrsina.add(new JLabel("Zmogljivost sušenja:"));
		povrsina.add(zmogljivostSusenjaPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
				
		// Pokažemo okno
		setVisible(true);
		
		// Nastavimo velikost
		setSize(800, 600);
		
		// Nastavimo obnašanje križca (x) - da konča aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam nov objekt tipa Trgovina");
		
	}
	
	// Metoda, ki jo predpisuje vmesnik ActionListener
	// Vhodni parametri: ae - dogodek
	// Potek/opis: doda stroj v tabelo
	// Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {
	
		System.out.println("Dodajam stroj ...");
		System.out.println("Zmogljivost pranja je " + zmogljivostPranjaPolje.getText());
		System.out.println("Zmogljivost sušenja je " + zmogljivostSusenjaPolje.getText());
		
		// Ustvarimo lokalni spremenljivki zmogljivostPranja, zmogljivostSusenja in stroj
		int zmogljivostPranja = Integer.parseInt(zmogljivostPranjaPolje.getText());
		int zmogljivostSusenja = Integer.parseInt(zmogljivostSusenjaPolje.getText());
		PralnoSusilniStroj stroj = new PralnoSusilniStroj(zmogljivostPranja, zmogljivostSusenja);		
		
		// Dodamo objekt v seznam
		modelTabele.addPralnoSusilniStroj(stroj);
		
	}

}
