package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author Marie
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;

	/**
	 * @param solde
	 * @param type
	 */
	public CompteBancaire(String type, double solde) {
		super();
		this.type = type;
		this.solde = solde;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Soustrait un montant au solde
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
