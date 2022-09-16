package soin_3_pensees.gillian.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Accueil implements Initializable {

   @FXML
   private Button boutonCreer;
   @FXML
   private Button boutonListe;
   @FXML
   private FontAwesomeIcon iconeCreer;
   @FXML
   private FontAwesomeIcon iconeListe;
 
   @Override
   public void initialize(URL location, ResourceBundle resources) {

       // TODO (don't really need to do anything here).
     
   }

   // When user click on myButton
   // this method will be called.
   public void creerJour(ActionEvent event) {
	   URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/CreerSouvenir.fxml");
	   Stage stage = (Stage) boutonCreer.getScene().getWindow();
	   try {
		Parent root = FXMLLoader.load(ressource);
		stage.setScene(new Scene(root));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
     
	public void lireListe(ActionEvent event) {
		   URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/ConsulterFaits.fxml");
		   Stage stage = (Stage) boutonCreer.getScene().getWindow();
		   try {
			Parent root = FXMLLoader.load(ressource);
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
