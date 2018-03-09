package Vue;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Controleur.Ctrl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import modele.Catapulte;

public class CtrlVue implements Initializable {

	private Ctrl ctrl = null;
	private Scene scene = null;

	@FXML
	private Button btnQuit;
	@FXML
	private TextField textfield;
	@FXML
	private Pane landscape;
	@FXML
	private GridPane grid;
	@FXML
	private Label cobaye;

	// seulement pour test affichage

	Catapulte c1 = new Catapulte();

	public CtrlVue(Ctrl ctrl) {
		try {
			this.ctrl = ctrl;
			FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/vue/Acceuil.fxml"));
			loader1.setController(this);

			Parent root = loader1.load();

			scene = new Scene(root);

		} catch (Exception e) {
			System.err.println("Erreur de chargement du fxml! " + e);
			e.printStackTrace();
		}

	}

	public Scene getScene() {
		return scene;
	}

	@FXML
	private void actionCharger() {

		// Charger une Sauvegarde
		System.out.println("CHARGER");

	}

	@FXML
	private void actionFermer(ActionEvent event) {
		System.out.println(((Button) event.getSource()).getId());
		Stage stage = (Stage) btnQuit.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void actionGrid(ActionEvent event) throws IOException {
		// System.out.println(((GridPane) event.getSource()).getId());
		System.out.println("btnGrille");

		try {

			Parent root = null;
			Stage stage = null;
			FXMLLoader loader = null;
			loader = new FXMLLoader(getClass().getResource("/vue/Lecture.fxml"));
			stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
			loader.setController(this);
			root = loader.load();
			scene = new Scene(root);
			stage.setFullScreenExitHint("");
			stage.setScene(scene);
			stage.setFullScreen(true);

			stage.show();
		} catch (Exception e) {

			System.err.println("Erreur de chargement du fxml! " + e);
			e.printStackTrace();
		}

		cobaye.setText("COBAYE : " + (((Button) event.getSource()).getText()));

		if (((Button) event.getSource()).getText().equals("69")) {
			cobaye.setText("COBAYE : " + (((Button) event.getSource()).getText()) + "ლ(´ڡ`ლ)");
		}

	}

	private void newGame() {
		// TODO Auto-generated method stub

	}

	@FXML
	private void ChangerScene(ActionEvent event) throws IOException {

		try {
			Parent root = null;
			Stage stage = null;
			FXMLLoader loader = null;

			String id = ((Button) event.getSource()).getId();

			switch (id) {
			case "btnNouveau1":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/Nouveau.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btnNouveau2":
				System.out.println(id);
				newGame();
				loader = new FXMLLoader(getClass().getResource("/vue/Principal.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btnRetour1":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/Acceuil.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btnMenu":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/Acceuil.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btnRetour3":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/Principal.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btnStatistiques":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/Statistiques.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btnRetour2":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/Principal.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;

			default:
				System.out.println("DEFAUT");
				break;
			}

			loader.setController(this);
			root = loader.load();
			scene = new Scene(root);
			stage.setFullScreenExitHint("");
			stage.setScene(scene);
			stage.setFullScreen(true);
			stage.show();
			changerIDs();

		} catch (Exception e) {

			System.err.println("Erreur de chargement du fxml! " + e);
			e.printStackTrace();
		}
	}

	private void changerIDs() {
		try {
			for (int i = 0; i < grid.getChildren().size(); i++) {
				((Button) grid.getChildren().get(i)).setText("" + i);
			}
		} catch (Exception e) {

		}
	}

	@FXML
	private void test() {
		System.out.println(((Button) grid.getChildren().get(7)).getText());
		((Button) grid.getChildren().get(7)).setText("123456789");

	}

	@FXML
	private void test2() {
		Group group = new Group();
		System.out.println("ALO");
		landscape.getChildren().add(group);
		group.getChildren().add(new Circle(0, 0, 10));
		group.setTranslateX(landscape.getPrefWidth() / 2);
		group.setTranslateY(landscape.getPrefHeight() / 2);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
