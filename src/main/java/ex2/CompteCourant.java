package ex2;

/**
 * Représente un compte courant
 * 
 * @author Marie
 */
public class CompteCourant extends CompteBancaire {

	/** montant du découvert autorisé */
	private double decouvert;

	public CompteCourant(String type, double solde, double decouvert) {
		super(type, solde);
		this.decouvert = decouvert;
	}

	/**
	 * soustrait un montant au solde en respectant le plafond du découvert autorisé
	 * 
	 * @param solde
	 * @param decouvert
	 */
	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter for decouvert
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
