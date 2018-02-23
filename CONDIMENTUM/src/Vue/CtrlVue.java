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
import javafx.stage.Stage;

public class CtrlVue implements Initializable {

	private Ctrl ctrl = null;
	private Scene scene = null;

	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
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
	private void HandleButtonAction(ActionEvent event) throws IOException {

		Parent root = null;
		Stage stage = null;

		try {

			if (event.getSource() == btn1) {

				FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/scene2.fxml"));
				loader.setController(this);
				root = loader.load();
				stage = (Stage) btn1.getScene().getWindow();
			}

			if (event.getSource() == btn2) {

				if (tf1.getText()!="") {
					
				}
				
				
			}

			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {

			System.err.println("Erreur de chargement du fxml! " + e);
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
