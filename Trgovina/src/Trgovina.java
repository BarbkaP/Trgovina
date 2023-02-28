import javax.swing.*;

// Uvozimo paket za delo z dogodki
import java.awt.event.*;

/**
 * 
 * @author barbka
 *
 */
public class Trgovina extends JFrame implements ActionListener {

	/**
	 * Zasebna spremenljivka povrsina
	 */
	private JPanel povrsina;
	/**
	 * Zasebna spremenljivka gumb
	 */
	private JButton dodajJButton;
	/**
	 * Zasebni spremenljivki zmogljivost pranja in zmogljivost sušenja
	 */
	private JTextField zmogljivostPranjaPolje, zmogljivostSusenjaPolje;
	/**
	 * Zasebna spremenljivka tabela
	 */
	private JTable tabela;
	/**
	 * Zasebna spremenljivka model tabele
	 */
	private PralnoSusilniStrojTableModel modelTabele;

	/**
	 * Javna statična metoda, ki se zažene ob zagonu programa
	 * ustvari novo okno
	 * 
	 * @param args Argumenti s katerimi kličemo program ob zagonu
	 */
	public static void main(String[] args) {
	
		Trgovina t = new Trgovina("Trgovina s pralno sušilnimi stroji");
		
	}
	
	/**
	 * Javni konstruktor
	 * 
	 * @param n naslov okna
	 */
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
	
	/**
	 * Metoda, ki jo predpisuje vmesnik ActionListener
	 * doda stroj v tabelo
	 * 
	 * @param ae ActionEvent dogodek
	 */
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
