package soin_3_pensees.gillian.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import soin_3_pensees.gillian.constantes.EMOTION_PASSE;
import soin_3_pensees.gillian.constantes.EMOTION_PRESENT;
import soin_3_pensees.gillian.constantes.forceCaractere.COURAGE;
import soin_3_pensees.gillian.constantes.forceCaractere.HUMANITE;
import soin_3_pensees.gillian.constantes.forceCaractere.JUSTICE;
import soin_3_pensees.gillian.constantes.forceCaractere.SAGESSE;
import soin_3_pensees.gillian.constantes.forceCaractere.TEMPERANCE;
import soin_3_pensees.gillian.constantes.forceCaractere.TRANSCENDANCE;
import soin_3_pensees.gillian.model.Jour;
import soin_3_pensees.gillian.utils.EcrireFichierExcel;

public class CreerSouvenir implements Initializable{

	//Boutons
	@FXML
	private Button boutonRetour;
	@FXML
	private Button boutonSauvegarder;

	//Champs
	@FXML
	private TextField faitField;

	//Emotions positives au passé
	@FXML
	private CheckBox satisfactionCheck;
	@FXML
	private CheckBox accomplissementCheck;
	@FXML
	private CheckBox fierteCheck;
	@FXML
	private CheckBox sereniteCheck;
	@FXML
	private CheckBox gratitudeCheck;
	@FXML
	private ArrayList<CheckBox> checkboxesPasse;

	//Emotions positives au présent
	@FXML
	private CheckBox joieCheck;
	@FXML
	private CheckBox plaisirCheck;
	@FXML
	private CheckBox curiositeCheck;
	@FXML
	private CheckBox interetCheck;
	@FXML
	private CheckBox ouvertureCheck;
	@FXML
	private CheckBox creativiteCheck;
	@FXML
	private CheckBox calmeCheck;
	@FXML
	private CheckBox espoirCheck;
	@FXML
	private CheckBox amusementCheck;
	@FXML
	private CheckBox inspirationCheck;
	@FXML
	private CheckBox admirationCheck;
	@FXML
	private CheckBox amourCheck;
	@FXML
	private ArrayList<CheckBox> checkboxesPresent;

	//Force de caractères
	@FXML
	private CheckBox creativiteFcCheck;
	@FXML
	private CheckBox curiositeFcCheck;
	@FXML
	private CheckBox jugementFcCheck;
	@FXML
	private CheckBox bravoureFcCheck;
	@FXML
	private CheckBox honneteteFcCheck;
	@FXML
	private CheckBox gentillesseFcCheck;
	@FXML
	private CheckBox intelligenceSocialeFcCheck;
	@FXML
	private CheckBox justiceFcCheck;
	@FXML
	private CheckBox travailEquipeFcCheck;
	@FXML
	private CheckBox pardonFcCheck;
	@FXML
	private CheckBox prudenceFcCheck;
	@FXML
	private CheckBox beauteEtExcellenceFcCheck;
	@FXML
	private CheckBox espoirFcCheck;
	@FXML
	private CheckBox spiritualiteFcCheck;
	@FXML
	private CheckBox amourApprendreFcCheck;
	@FXML
	private CheckBox perspectiveFcCheck;
	@FXML
	private CheckBox perseveranceFcCheck;
	@FXML
	private CheckBox vitaliteFcCheck;
	@FXML
	private CheckBox amourFcCheck;
	@FXML
	private CheckBox managerFcCheck;
	@FXML
	private CheckBox humiliteFcCheck;
	@FXML
	private CheckBox autoregulationFcCheck;
	@FXML
	private CheckBox reconnaissanceFcCheck;
	@FXML
	private CheckBox joieFcCheck;
	private ArrayList<CheckBox> checkboxesForceCaractere;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		creerListeCheckBox();
	}

	public void retourAccueil(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
	      alert.setTitle("Delete File");
	      alert.setHeaderText("Êtes-vous sûr de vouloir quitter la page?");
	      alert.setContentText("Toute donnée non enregistrée sera perdue");
	      // option != null.
	      Stage stageAlert = (Stage) alert.getDialogPane().getScene().getWindow();
	      stageAlert.getIcons().add(new Image(getClass().getResourceAsStream("icone.png")));
			
	      Optional<ButtonType> option = alert.showAndWait();

	      if (option.get() == null) {
	      } else if (option.get() == ButtonType.OK) {
	    	  URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/Accueil.fxml");
	  		Stage stage = (Stage) boutonRetour.getScene().getWindow();
	  		try {
	  			Parent root = FXMLLoader.load(ressource);
	  			stage.setScene(new Scene(root));
	  		} catch (IOException e) {
	  			System.out.println("une erreur s'est produite");
	  		}
	      } else if (option.get() == ButtonType.CANCEL) {
	      } else {
	      }
		
	}

	public void sauvegarder(ActionEvent event) {
		creerListeCheckBox();
		Jour jour=new Jour();

		String texte=faitField.getText();
		jour.setFait(texte);
		for(CheckBox checkbox :this.checkboxesPasse) {
			if(checkbox!=null&checkbox.isSelected()) {
				for(EMOTION_PASSE emotionPasse:EMOTION_PASSE.values()) {
					if(checkbox.getText().equals(emotionPasse.name())) {
						jour.ajouter_emotion_passe(emotionPasse);
					}
				}
			}
		}
		for(CheckBox checkbox :this.checkboxesPresent) {
			if(checkbox!=null&checkbox.isSelected()) {
				for(EMOTION_PRESENT emotionPresent:EMOTION_PRESENT.values()) {
					if(checkbox.getText().equals(emotionPresent.name())) {
						jour.ajouter_emotion_present(emotionPresent);
					}
				}
			}
		}
		for(CheckBox checkbox :this.checkboxesForceCaractere) {
			if(checkbox!=null&checkbox.isSelected()) {
				for(COURAGE force:COURAGE.values()) {
					if(checkbox.getText().equals(force.name())) {
						jour.ajouter_force_caractere(force.name());
					}
				}
				for(HUMANITE force:HUMANITE.values()) {
					if(checkbox.getText().equals(force.name())|(checkbox.getText().equals("Intelligence sociale")&force==HUMANITE.IntelligenceSociale)) {
						jour.ajouter_force_caractere(force.name());
					}
				}
				for(JUSTICE force:JUSTICE.values()) {
					if(checkbox.getText().equals(force.name())|(checkbox.getText().equals("Travail d'équipe")&force==JUSTICE.TravailDEquipe)) {
						jour.ajouter_force_caractere(force.name());
					}
				}
				for(SAGESSE force:SAGESSE.values()) {
					if(checkbox.getText().equals(force.name())|(checkbox.getText().equals("L'amour d'apprendre")&force==SAGESSE.LamourDApprendre)) {
						jour.ajouter_force_caractere(force.name());
					}
				}
				for(TEMPERANCE force:TEMPERANCE.values()) {
					if(checkbox.getText().equals(force.name())) {
						jour.ajouter_force_caractere(force.name());
					}
				}
				for(TRANSCENDANCE force:TRANSCENDANCE.values()) {
					if(checkbox.getText().equals(force.name())|(checkbox.getText().equals("Beauté & Excellence")&force==TRANSCENDANCE.BeautéEtExcellence)) {
						jour.ajouter_force_caractere(force.name());
					}
				}
			}
		}
		if(jour.getFait().equals("")|jour.getEmotion_passe().isEmpty()|jour.getEmotion_present().isEmpty()|jour.getForce_caractere().isEmpty()) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Attention");
			alert.setContentText("Veillez à remplir tous les champs");
			Stage stageAlert = (Stage) alert.getDialogPane().getScene().getWindow();
		    stageAlert.getIcons().add(new Image(getClass().getResourceAsStream("icone.png")));	
			alert.showAndWait();
		}
		else{
			EcrireFichierExcel.creerSouvenirFichierExcel(jour);
			URL ressource = getClass().getResource("/soin_3_pensees/gillian/vue/Accueil.fxml");
			Stage stage = (Stage) boutonRetour.getScene().getWindow();
			try {
				Parent root = FXMLLoader.load(ressource);
				stage.setScene(new Scene(root));
			} catch (IOException e) {
				System.out.println("une erreur s'est produite");
			}
		}
	}

	//Créé les listes de Checkbox
	private void creerListeCheckBox() {
		this.checkboxesPasse = new ArrayList<CheckBox>();
		this.checkboxesPresent = new ArrayList<CheckBox>();
		this.checkboxesForceCaractere = new ArrayList<CheckBox>();

		this.checkboxesPresent.add(joieCheck);
		this.checkboxesPresent.add(plaisirCheck);
		this.checkboxesPresent.add(curiositeCheck);
		this.checkboxesPresent.add(interetCheck);
		this.checkboxesPresent.add(ouvertureCheck);
		this.checkboxesPresent.add(creativiteCheck);
		this.checkboxesPresent.add(calmeCheck);
		this.checkboxesPresent.add(espoirCheck);
		this.checkboxesPresent.add(amusementCheck);
		this.checkboxesPresent.add(inspirationCheck);
		this.checkboxesPresent.add(admirationCheck);
		this.checkboxesPresent.add(amourCheck);

		this.checkboxesPasse.add(satisfactionCheck);
		this.checkboxesPasse.add(accomplissementCheck);
		this.checkboxesPasse.add(fierteCheck);
		this.checkboxesPasse.add(sereniteCheck);
		this.checkboxesPasse.add(gratitudeCheck);

		this.checkboxesForceCaractere.add(creativiteFcCheck);
		this.checkboxesForceCaractere.add(curiositeFcCheck);
		this.checkboxesForceCaractere.add(jugementFcCheck);
		this.checkboxesForceCaractere.add(bravoureFcCheck);
		this.checkboxesForceCaractere.add(honneteteFcCheck);
		this.checkboxesForceCaractere.add(gentillesseFcCheck);
		this.checkboxesForceCaractere.add(intelligenceSocialeFcCheck);
		this.checkboxesForceCaractere.add(justiceFcCheck);
		this.checkboxesForceCaractere.add(travailEquipeFcCheck);
		this.checkboxesForceCaractere.add(pardonFcCheck);
		this.checkboxesForceCaractere.add(prudenceFcCheck);
		this.checkboxesForceCaractere.add(beauteEtExcellenceFcCheck);
		this.checkboxesForceCaractere.add(espoirFcCheck);
		this.checkboxesForceCaractere.add(spiritualiteFcCheck);
		this.checkboxesForceCaractere.add(amourApprendreFcCheck);
		this.checkboxesForceCaractere.add(perspectiveFcCheck);
		this.checkboxesForceCaractere.add(perseveranceFcCheck);
		this.checkboxesForceCaractere.add(vitaliteFcCheck);
		this.checkboxesForceCaractere.add(amourFcCheck);
		this.checkboxesForceCaractere.add(managerFcCheck);
		this.checkboxesForceCaractere.add(humiliteFcCheck);
		this.checkboxesForceCaractere.add(autoregulationFcCheck);
		this.checkboxesForceCaractere.add(reconnaissanceFcCheck);
		this.checkboxesForceCaractere.add(joieFcCheck);
	}

	//Affiche le texte d'explication lié à la case à cocher
	public void afficherContexte (MouseEvent event) {
		if(event.getButton()==MouseButton.SECONDARY) {
			String texte = "unknown";
			Label secondLabel = new Label("I'm a Label on new Window");
			if(event.getSource().equals(creativiteFcCheck)) {
				texte = SAGESSE.Créativité.getDescription();
			}
			else if(event.getSource().equals(curiositeFcCheck)) {
				texte = SAGESSE.Curiosité.getDescription();
			}
			else if(event.getSource().equals(jugementFcCheck)) {
				texte = SAGESSE.Jugement.getDescription();
			}
			else if(event.getSource().equals(amourApprendreFcCheck)) {
				texte = SAGESSE.LamourDApprendre.getDescription();
			}
			else if(event.getSource().equals(perspectiveFcCheck)) {
				texte = SAGESSE.Perspective.getDescription();
			}			
			else if(event.getSource().equals(bravoureFcCheck)) {
				texte = COURAGE.Bravoure.getDescription();
			}

			else if(event.getSource().equals(honneteteFcCheck)) {
				texte = COURAGE.Honnêteté.getDescription();
			}			
			else if(event.getSource().equals(perseveranceFcCheck)) {
				texte = COURAGE.Persévérance.getDescription();
			}
			else if(event.getSource().equals(vitaliteFcCheck)) {
				texte = COURAGE.Vitalité.getDescription();
			}
			else if(event.getSource().equals(amourFcCheck)) {
				texte = HUMANITE.Amour.getDescription();
			}
			else if(event.getSource().equals(intelligenceSocialeFcCheck)) {
				texte = HUMANITE.IntelligenceSociale.getDescription();
			}
			else if(event.getSource().equals(gentillesseFcCheck)) {
				texte = HUMANITE.Gentillesse.getDescription();
			}
			else if(event.getSource().equals(justiceFcCheck)) {
				texte = JUSTICE.Justice.getDescription();
			}
			else if(event.getSource().equals(travailEquipeFcCheck)) {
				texte = JUSTICE.TravailDEquipe.getDescription();
			}
			else if(event.getSource().equals(managerFcCheck)) {
				texte = JUSTICE.Manager.getDescription();
			}
			else if(event.getSource().equals(pardonFcCheck)) {
				texte = TEMPERANCE.Pardon.getDescription();
			}
			else if(event.getSource().equals(prudenceFcCheck)) {
				texte = TEMPERANCE.Prudence.getDescription();
			}
			else if(event.getSource().equals(humiliteFcCheck)) {
				texte = TEMPERANCE.Humilité.getDescription();
			}
			else if(event.getSource().equals(autoregulationFcCheck)) {
				texte = TEMPERANCE.Autorégulation.getDescription();
			}
			else if(event.getSource().equals(beauteEtExcellenceFcCheck)) {
				texte = TRANSCENDANCE.BeautéEtExcellence.getDescription();
			}
			else if(event.getSource().equals(espoirFcCheck)) {
				texte = TRANSCENDANCE.Espoir.getDescription();
			}
			else if(event.getSource().equals(spiritualiteFcCheck)) {
				texte = TRANSCENDANCE.Spiritualité.getDescription();
			}
			else if(event.getSource().equals(reconnaissanceFcCheck)) {
				texte = TRANSCENDANCE.Reconnaissance.getDescription();
			}
			else if(event.getSource().equals(joieFcCheck)) {
				texte = TRANSCENDANCE.Joie.getDescription();
			}
			secondLabel = new Label(texte);
			StackPane secondaryLayout = new StackPane();
			secondaryLayout.getChildren().add(secondLabel);
			Scene secondScene = new Scene(secondaryLayout, 700, 500);

			// New window (Stage)
			Stage newWindow = new Stage();
			newWindow.setTitle("Explications");

			newWindow.setScene(secondScene);
			newWindow.getIcons().add(new Image(getClass().getResourceAsStream("icone.png")));
			secondLabel.setWrapText(true);
			secondLabel.prefHeightProperty().bind(secondScene.heightProperty());
			secondLabel.prefWidthProperty().bind(secondScene.widthProperty());
			// Set position of second window, related to primary window.
			newWindow.setX(((Stage) boutonRetour.getScene().getWindow()).getX() + 200);
			newWindow.setY(((Stage) boutonRetour.getScene().getWindow()).getY() + 100);
			newWindow.setResizable(false);
			newWindow.show();
		}
	}
}
