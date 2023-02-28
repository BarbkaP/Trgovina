/**
 * 
 * @author barbka
 *
 */
public class NedefiniranPralniProgramException extends Exception {

	/**
	 * Javni konstruktor
	 * 
	 * @param vecinskiMaterial večinski material iz katerega so oblačila v pralnem stroju
	 */
	public NedefiniranPralniProgramException(String vecinskiMaterial) {  
		super("Način pranja za material " + vecinskiMaterial + " ni definiran!");  
    }

}
