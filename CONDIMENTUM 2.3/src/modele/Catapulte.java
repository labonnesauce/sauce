package modele;

import java.util.LinkedList;
import java.util.List;

public class Catapulte {

	/**
	 * Cette classe consiste à prendre l'objet bras pour construire une catapulte.
	 * Le bras implique aussi un pivot
	 * 
	 * @author Desch
	 */

	public static final int NB_BRAS_MIN = 1;
	public static final int NB_BRAS_MAX = 4;
	private int numSpecimen; // sert à identifier le spécimen par son numéro.

	private int nb_Bras;
	public List<Bras> catapulte;

	/**
	 * Constructeur de catapulte de base
	 */
	public Catapulte() {
		setNb_Bras(randomBras());
		catapulte = new LinkedList<Bras>();
		for (int i = 0; i < getNb_Bras(); i++) {
			catapulte.add(new Bras(randomLongueur(), randomAngleInitial(), randomAngleFinale(), randomVitesse()));

		}
	}

	/**
	 * 
	 * @param cata:
	 *            Ce constructeur reçoit en paramètre une catapulte et il l'a
	 *            modifie pour en créer une autre
	 */
	public Catapulte(Catapulte cata) {
		for (int i = 0; i < cata.getNb_Bras(); i++) {
			// TODO
		}
	}

	public int getNb_Bras() {
		return nb_Bras;
	}

	public void setNb_Bras(int nb_Bras) {
		this.nb_Bras = nb_Bras;
	}

	public List<Bras> getCatapulte() {
		return catapulte;
	}

	public int getNumSpecimen() {
		return numSpecimen;
	}

	public void setNumSpecimen(int numSpecimen) {
		this.numSpecimen = numSpecimen;
	}

	// Les méthodes random pour créer la catapulte random
	private int randomBras() {
		int nbBras = (int) ((int) NB_BRAS_MIN + (Math.random() * (NB_BRAS_MAX)));
		return nbBras;
	}

	private int randomLongueur() {
		int longueur = (int) ((int) Bras.LONGUEUR_MIN + (Math.random() * (Bras.LONGUEUR_MAX)));
		return longueur;
	}

	private int randomAngleInitial() {
		int angI = (int) (Math.random() * (Bras.ANGLE_MAX - Bras.ANGLE_MIN));
		return angI;
	}

	private int randomAngleFinale() {
		int angF = (int) (Math.random() * (Bras.ANGLE_MAX - Bras.ANGLE_MIN));
		return angF;
	}

	private int randomVitesse() {
		int vitesse = (int) (Math.random() * (Bras.RPS_MAX - Bras.RPS_MIN));
		return vitesse;
	}

	/**
	 * Cette méthode enclenche le processus de lancement de la catapulte
	 */
	public void lancement() {

	}

	public static void main(String[] args) {

		Catapulte c1 = new Catapulte();

		System.out.println(c1.getNb_Bras());
		System.out.println(c1.getCatapulte().get(0));
		System.out.println(c1.getCatapulte().get(1));
	}

}
