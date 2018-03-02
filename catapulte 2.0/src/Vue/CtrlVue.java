package Vue;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Controleur.Ctrl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CtrlVue implements Initializable {

	private Ctrl ctrl = null;
	private Scene scene = null;

	@FXML
	private Button btnQuit;
	@FXML
	private TextField tf1;

	public CtrlVue(Ctrl ctrl) {
		try {
			this.ctrl = ctrl;
			FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/vue/scene1.fxml"));
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
			loader = new FXMLLoader(getClass().getResource("/vue/scene4.fxml"));
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
			case "btnNew":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/scene2.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btn2":
				System.out.println(id);
				newGame();
				loader = new FXMLLoader(getClass().getResource("/vue/scene3.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btn3":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/scene1.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btn4":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/scene1.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btn5":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/scene3.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btn6":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/scene5.fxml"));
				stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				break;
			case "btn7":
				System.out.println(id);
				loader = new FXMLLoader(getClass().getResource("/vue/scene3.fxml"));
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

		} catch (Exception e) {

			System.err.println("Erreur de chargement du fxml! " + e);
			e.printStackTrace();
		}
	}

	private void initGrid() {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initGrid();

	}

}
