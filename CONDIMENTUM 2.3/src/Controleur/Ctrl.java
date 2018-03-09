package Controleur;

import Vue.CtrlVue;
import javafx.scene.Scene;

public class Ctrl {

	
	private CtrlVue ctrlVue;
	
	public Ctrl() {


		this.ctrlVue = new CtrlVue(this);


	}

	public Scene getMainScene() {
		return ctrlVue.getScene();
	}
	
}
