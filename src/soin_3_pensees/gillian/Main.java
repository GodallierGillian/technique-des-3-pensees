package soin_3_pensees.gillian;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage primaryStage) {
        try {
            // Read file fxml and draw interface.
        	URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/Accueil.fxml");
        	Parent root = FXMLLoader.load(ressource);

            primaryStage.setTitle("Application 3 pensées");
            primaryStage.setResizable(false);
            primaryStage.setScene(new Scene(root));
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icone.png")));
            primaryStage.show();
        
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args) {
        launch(args);
    }
}
