/**
 * 
 * @author barbka
 *
 */
public interface Senzor {

	/**
	 * Javna metoda, ki izbere pralni program
	 * izbere pralni program glede na večinski material oblačil v pralnem stroju
	 * 
	 * @return izbrani pralni program
	 * @throws NedefiniranPralniProgramException vrže napako v primeru da program za pranje ni definiran
	 */
	public String izberiPralniProgram() throws NedefiniranPralniProgramException;

}
