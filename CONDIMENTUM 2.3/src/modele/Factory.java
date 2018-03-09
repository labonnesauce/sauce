package modele;

import java.util.LinkedList;
import java.util.List;

public class Factory {
	/**
	 * Cette classe fonctionne comme une usine à catapulte
	 * 
	 * @author Desch
	 */

	private List<Catapulte> liste_cata;

	public Factory(int nbCata) {
		liste_cata = new LinkedList<Catapulte>();
		for (int i = 0; i < nbCata; i++) {
			liste_cata.add(new Catapulte());
		}
	}

	public List<Catapulte> getListe_cata() {
		return liste_cata;
	}

	public void setListe_cata(List<Catapulte> liste_cata) {
		this.liste_cata = liste_cata;
	}

}
