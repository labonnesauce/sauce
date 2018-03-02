package modele;

import java.util.ArrayList;
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

	private int nb_Bras;
	public List<Bras> catapulte;

	/**
	 * Constructeur de catapulte de base
	 */
	public Catapulte() {
		setNb_Bras(randomBras());
		for (int i = 0; i < getNb_Bras(); i++) {
			catapulte = new ArrayList<Bras>();
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

	// Les méthodes random pour créer la catapulte random
	private int randomBras() {
		int nbBras = (int) (Math.random() * (NB_BRAS_MAX - NB_BRAS_MIN));
		return nbBras;
	}

	private int randomLongueur() {
		int longueur = (int) (Math.random() * (Bras.LONGUEUR_MAX - Bras.LONGUEUR_MIN));
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

}
