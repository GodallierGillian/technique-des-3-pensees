package soin_3_pensees.gillian.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import soin_3_pensees.gillian.constantes.EMOTION_PASSE;
import soin_3_pensees.gillian.constantes.EMOTION_PRESENT;
import soin_3_pensees.gillian.model.Jour;
import soin_3_pensees.gillian.utils.EcrireFichierExcel;

public class ConsulterFaits implements Initializable{

	@FXML
	private Button boutonRetour;
	@FXML
	private AnchorPane cadreFaits;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ArrayList<Jour> souvenirs = EcrireFichierExcel.lireFichierExcel();
		int y=0;
		for(Jour jour: souvenirs) {

			GridPane gridTemp= new GridPane();
			gridTemp.setMouseTransparent(true);
			for (int i = 0; i < 5; i++) {
				ColumnConstraints columnctrt = new ColumnConstraints(100);
				gridTemp.getColumnConstraints().add(columnctrt);
			}
			Pane pane1 = new Pane();
			Pane pane2 = new Pane();
			Pane pane3 = new Pane();
			Pane pane4 = new Pane();
			Pane pane5 = new Pane();

			Label label1=new Label();
			label1.setText(jour.getJour());
			Label label2=new Label();
			label2.setText(jour.getFait());
			Label label3=new Label();
			String sentiment_passe = "";
			for(EMOTION_PASSE emotion: jour.getEmotion_passe()) {
				sentiment_passe=sentiment_passe+ emotion +" ";
			}
			label3.setText(sentiment_passe);
			String sentiment_present="";
			Label label4=new Label();
			for(EMOTION_PRESENT emotion: jour.getEmotion_present()) {
				sentiment_present= sentiment_present+ emotion +" ";
			}
			label4.setText(sentiment_present);
			Label label5=new Label();
			String force_caractere="";
			for(String forceCaractere:jour.getForce_caractere()) {
				force_caractere=force_caractere+forceCaractere+" ";
			}
			label5.setText(force_caractere);
			Label[] labels= {label1,label2,label3,label4,label5};
			Pane[] panes= {pane1,pane2,pane3,pane4,pane5};

			int column=0;
			for(Label label:labels) {
				gridTemp.add(label,column,0);
				GridPane.setHalignment(label, HPos.CENTER);
				GridPane.setValignment(label, VPos.CENTER);
				gridTemp.setAlignment(Pos.CENTER);
				label.setAlignment(Pos.CENTER);
				column+=1;
			}
			column=0;
			for(Pane pane : panes) {
				if(!pane.equals(pane5)) {
					pane.setStyle("-fx-border-width: 0 1 0 0; -fx-border-color: #FFFFFF;");
				}
				pane.setPrefWidth(200);
				gridTemp.add(pane, column, 0);
				column+=1;
			}
			gridTemp.setPrefWidth(550);
			gridTemp.setPrefHeight(70);
			Button boutonTemp=new Button("",gridTemp);
			boutonTemp.setMaxHeight(50);
			boutonTemp.setMinHeight(50);
			boutonTemp.setMaxWidth(580);
			boutonTemp.setMinWidth(580);
			boutonTemp.setStyle("-fx-background-color: #993366; -fx-border-color: #663399; -fx-border-radius: 25; -fx-border-width: 5;");
			boutonTemp.setLayoutY(y);
			boutonTemp.setOnAction(e -> {
				afficherSouvenir(jour);
			});
			cadreFaits.setPrefHeight(y+50);
			cadreFaits.getChildren().add(boutonTemp);
			label1.prefHeightProperty().bind(gridTemp.heightProperty());
			label2.prefHeightProperty().bind(gridTemp.heightProperty());
			label3.prefHeightProperty().bind(gridTemp.heightProperty());
			label4.prefHeightProperty().bind(gridTemp.heightProperty());
			label5.prefHeightProperty().bind(gridTemp.heightProperty());
			y+=55;

		}
	}
	private void afficherSouvenir(Jour jour) {
		try {
			@SuppressWarnings("unused")
			URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/Fait.fxml");
			Stage stage = (Stage) boutonRetour.getScene().getWindow();
			FXMLLoader fxmlLoader = new FXMLLoader();
			Pane p = fxmlLoader.load(getClass().getResource("/soin_3_pensees/gillian/vue/Fait.fxml").openStream());
			Fait  controller=(Fait) fxmlLoader.getController();
			controller.setJour(jour);
			Scene scene = new Scene(p);
			stage.setScene(scene);
			stage.show();
		} catch (IOException exception) {
			System.err.println(String.format("Error: %s", exception.getMessage()));
		}
	}
	public void retourAccueil(ActionEvent event) {
		URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/Accueil.fxml");
		Stage stage = (Stage) boutonRetour.getScene().getWindow();
		try {
			Parent root = FXMLLoader.load(ressource);
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
