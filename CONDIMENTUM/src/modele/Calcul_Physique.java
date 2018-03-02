package modele;

/**
 * 
 * @author Olivier Bamrounsavath
 *
 */
public class Calcul_Physique {

	public static double G = 9.81; // m par s^2

	/**
	 * Retourne la distance du projectile
	 * 
	 * @param vx
	 *            : La vitesse en X du projectile (m/s)
	 * @param t
	 *            : Le temps de vol du projectile (s)
	 * @return : La distance parcoutue (m)
	 */
	public double distance(double vx, double t) {
		return vx * t;
	}

	/**
	 * Retourne le composant X d'un vecteur vitesse
	 * 
	 * @param v
	 *            : La norme du vecteur vitesse (m/s)
	 * @param ori
	 *            : L'orientation du vecteur vitesse (Degree)
	 * @return : La vitesse horizontal (m/s)
	 */
	public double vitesseX(double v, int ori) {

		double rad = (ori * 2 * Math.PI) / 360;

		return (Math.sin(rad) * v);
	}

	/**
	 * Retourne le composant Y d'un vecteur vitesse
	 * 
	 * @param v
	 *            : La norme du vecteur vitesse (m/s)
	 * @param ori
	 *            : L'orientation du vecteur vitesse (Degree)
	 * @return : La vitesse vertical (m/s)
	 */
	public double vitesseY(double v, int ori) {

		double rad = (ori * 2 * Math.PI) / 360;

		return (Math.cos(rad) * v);
	}

	/**
	 * Retourne le temps de vol du projectile
	 * 
	 * @param vy
	 *            : La vitesse vertical (m/s)
	 * @param h
	 *            : La hauteur initial du projectile selon le sol (m)
	 * @return : Le temps de vol (s)
	 */
	public double tempsDeVol(double vy, double h) {
		// Formule Quadratique
		double temps1 = (-vy + Math.sqrt(vy * vy + 2 * G * h)) / G; // Racine +

		double vraiTemps = temps1;

		double temps2 = (-vy - Math.sqrt(vy * vy + 2 * G * h)) / G; // Racine -

		// On garde la plus grande
		if (temps2 > vraiTemps) {
			vraiTemps = temps2;
		}

		return vraiTemps;

	}

	/**
	 * Retourne la vitesse angulaire d'un bras
	 * 
	 * @param rps
	 *            : Le nombre de tours par secondes (un entier n)
	 * @param tempsRotation
	 *            : Le temps de rotation entre angle initial et l'angle final (s)
	 * @return La vitesse angulaire (rad/s)
	 */
	public double vitesseAngulaire(int rps, double tempsRotation) {
		return ((rps * 2 * Math.PI) / tempsRotation);
	}

	/**
	 * Retourne la vitesse tangentielle d'un bras
	 * 
	 * @param w
	 *            : La vitesse Angulaire (rad/s)
	 * @param L
	 *            : La longueur du bras
	 * @return : La vitesse tengentielle (m/s)
	 */
	public double vitesseTangentielle(int w, int L) {
		return w * L;
	}

	/**
	 * Retourne l'orientation d'un vecteur selon ses composantes
	 * 
	 * @param a
	 *            : La longueur horizontal du triangle formé par le vecteur (m)
	 * @param b
	 *            : La hauteur vertical du triangle formé par le vecteur (m)
	 * @return : L'orientation en degree du vecteur
	 */
	public double calculOrientation(int a, int b) {
		double oriRad = Math.atan(b / a);
		double oriDeg = oriRad * 360 / (2 * Math.PI);

		double bonneOriDeg = oriDeg;

		if (a < 0 && b > 0) {
			bonneOriDeg = oriDeg + 180;
		} else if (a < 0 && b < 0) {
			bonneOriDeg = oriDeg + 180;
		} else if (a > 0 && b < 0) {
			bonneOriDeg = oriDeg + 360;
		}

		return bonneOriDeg;
	}

}
