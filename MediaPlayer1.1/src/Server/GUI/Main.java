/**
 * Dan Coleman R00151926
 * Distributed Systems Programming Project 1: Media Player
 * Main : Loads up the Gui
 */
package Server.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException{

		Parent gui = null; //Creates Parent

		gui = FXMLLoader.load(getClass().getResource("MainScreen.fxml")); //Loads up fmxl file

		primaryStage.setTitle("Dan Coleman R00151926 MediaPlayer"); //Names Primary Stage

		primaryStage.setScene(new Scene(gui, 680, 400)); //Sets scene to size

		primaryStage.setResizable(false);//Disables changing it's size

		primaryStage.show();//Show stage
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
