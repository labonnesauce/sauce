package App;

import Controleur.Ctrl;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

	private Ctrl ctrl;
	
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ctrl = new Ctrl();
		primaryStage.setScene(ctrl.getMainScene());
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}

}
