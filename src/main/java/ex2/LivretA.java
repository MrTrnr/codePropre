package ex2;

/**
 * Représente un Livret A
 * 
 * @author Marie
 */

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * soustrait un montant au solde si le solde restant est positif
	 */
	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * applique la rémunération annuelle avec le taux de rémunération
	 * 
	 * @param solde
	 * @param tauxRemuneration
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter for tauxRemuneration
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
