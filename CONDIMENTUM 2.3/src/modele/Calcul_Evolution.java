package modele;

import java.util.LinkedList;
import java.util.List;

public class Calcul_Evolution {

	public List<Catapulte> kill(List<Catapulte> liste) {
		List<Catapulte> retour = new LinkedList<>();
		int val = 99;

		while (val >= 0) {
			double chanceSurvie = (100.5 - val) / 100;

			if (Math.random() > chanceSurvie) {
				retour.add(liste.get(val));
			}

			if (retour.size() == 50) {
				break;
			}
			val--;
		}

		return retour;

	}

	public static List<Integer> test() {
		List<Integer> test = new LinkedList<>();
		int val = 100;

		while (val >= 1) {
			double chanceSurvie = (100.5 - val) / 100;

			if (Math.random() > chanceSurvie) {
				System.out.print(val + " ");
				test.add(val);
			}

			if (test.size() == 50) {
				break;
			}
			val--;
		}
		return test;

	}

	public static void main(String[] args) {

		List<Integer> test = test();

		System.out.println("\n" + "size:" + test.size());
	}

}