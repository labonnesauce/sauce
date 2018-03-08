package modele;

/**
 * package modele;
 * 
 * @author Olivier Bamrounsavath
 *
 */

public class Bras {

	/**
	 * Cette classe est une articulation de la catapulte. Elle a une longueur
	 * variable et une amplitude de rotation d�finie entre deux angles; initial (i)
	 * et final (f). Elle � un angle pr�sent qui changera a chaque instant et une
	 * vitesse de rotation.
	 */

	public static final int RPS_MIN = 0;
	public static final int RPS_MAX = 2;
	public static final int LONGUEUR_MAX = 10;
	public static final int LONGUEUR_MIN = 1;
	public static final int ANGLE_MAX = 360;
	public static final int ANGLE_MIN = 0;

	private int longueur; // longueur du bras
	private int angle_i; // angle initial
	private int angle_f; // angle final
	private int rps; // tour par seconde

	// Constructeur
	// si les valeurs en parametres ne sont pas valid�es ont construit un bras avec
	// les valeurs minimales
	public Bras(int longueur, int angle_i, int angle_f, int vitesse) {

		if (validerAngle(angle_f) && validerAngle(angle_i) && (validerLongueur(longueur))) {

			setLongueur(longueur);
			setAngle_i(angle_i);
			setAngle_f(angle_f);
			setRps(vitesse);

		} else {

			setLongueur(LONGUEUR_MIN);
			setAngle_f(ANGLE_MIN);
			setAngle_i(ANGLE_MIN);
			setRps(RPS_MIN);
		}

	}

	// Get & Set
	public int getLongueur() {
		return longueur;
	}

	private void setLongueur(int longueur) {
		if (validerLongueur(longueur)) {
			this.longueur = longueur;
		}
	}

	public int getAngle_i() {
		return angle_i;
	}

	private void setAngle_i(int angle_i) {
		if (validerAngle(angle_i))
			this.angle_i = angle_i;
	}

	public int getAngle_f() {
		return angle_f;
	}

	private void setAngle_f(int angle_f) {
		if (validerAngle(angle_f))
			this.angle_f = angle_f;
	}

	public int getRps() {
		return rps;
	}

	public void setRps(int rps) {
		if (rps == 0 || rps == 1 || rps == 2)
			this.rps = rps;
	}

	// Methods

	/**
	 * Le temps de rotation
	 * 
	 * @return t : le temps que prends le bras a effectuer son amplitude. la
	 *         diff�rece des angles divis�es par le nombre de tours par seconde si
	 *         le nombre de tour par minute est �gal a 0 la m�thode retourne -1
	 */
	public double temps() {
		double temps = -1;

		// on convertit les angles en radians
		double angle_fRad = getAngle_f() * (2 * Math.PI) / 360;
		double angle_iRad = getAngle_i() * (2 * Math.PI) / 360;

		// 1 rps est �gale a un tour par seconde donc a 2Pi rad/sec
		if (getRps() != 0) {
			temps = ((angle_fRad - angle_iRad) / (getRps() * 2 * Math.PI));
		}
		return temps;
	}

	/**
	 * la hauteur du bras
	 * 
	 * @return la hauteur du bras
	 */
	public double hauteur() {

		double angleRad = getAngle_i() * (2 * Math.PI) / 360;

		return getLongueur() / (Math.sin(angleRad));

	}

	public static boolean validerLongueur(int longueur) {

		return ((longueur <= LONGUEUR_MAX) && (longueur >= LONGUEUR_MIN));
	}

	public static boolean validerAngle(int angle) {

		return ((angle <= ANGLE_MAX) && (angle >= ANGLE_MIN));
	}

}