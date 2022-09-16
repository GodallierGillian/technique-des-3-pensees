package soin_3_pensees.gillian.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import soin_3_pensees.gillian.constantes.EMOTION_PASSE;
import soin_3_pensees.gillian.constantes.EMOTION_PRESENT;

public class Jour {
	private String date;
	private String fait;
	private ArrayList<EMOTION_PASSE> emotion_passe = new ArrayList<EMOTION_PASSE>();
	private ArrayList<EMOTION_PRESENT> emotion_present = new ArrayList<EMOTION_PRESENT>();
	private ArrayList<String> force_caractere = new ArrayList<String>();
	
	//Constructeurs
	public Jour(String date, String fait, ArrayList<EMOTION_PASSE> emotion_passe,
			ArrayList<EMOTION_PRESENT> emotion_present, ArrayList<String> force_caractere) {
		super();
		this.date = date;
		this.fait = fait;
		this.emotion_passe = emotion_passe;
		this.emotion_present = emotion_present;
		this.force_caractere = force_caractere;
	}
	
	public Jour() {
		super();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatDate = new java.text.SimpleDateFormat("dd/MM/YYYY");
		this.date = formatDate.format(cal.getTime());
	}

	//Déclaration des getter et setter
	public String getJour() {
		return date;
	}
	public void setJour(String date) {
		this.date = date;
	}
	public String getFait() {
		return fait;
	}
	public void setFait(String fait) {
		this.fait = fait;
	}
	public ArrayList<EMOTION_PASSE> getEmotion_passe() {
		return emotion_passe;
	}
	public void setEmotion_passe(ArrayList<EMOTION_PASSE> emotion_passe) {
		this.emotion_passe = emotion_passe;
	}
	public ArrayList<EMOTION_PRESENT> getEmotion_present() {
		return emotion_present;
	}
	public void setEmotion_present(ArrayList<EMOTION_PRESENT> emotion_present) {
		this.emotion_present = emotion_present;
	}
	
	
	public ArrayList<String> getForce_caractere() {
		return force_caractere;
	}
	public void setForce_caractere(ArrayList<String> force_caractere) {
		this.force_caractere = force_caractere;
	}
	//fonctions ajouter
	public void ajouter_emotion_passe(EMOTION_PASSE emotion) {
		this.getEmotion_passe().add(emotion);
	}
	public void ajouter_emotion_present(EMOTION_PRESENT emotion) {
		this.getEmotion_present().add(emotion);
	}
	public void ajouter_force_caractere(String force) {
		this.getForce_caractere().add(force);
	}
	
	//fonctions supprimer
	public void supprimer_emotion_passe(EMOTION_PASSE emotion) {
		this.getEmotion_passe().remove(emotion);
	}
	public void supprimer_emotion_present(EMOTION_PRESENT emotion) {
		this.getEmotion_present().remove(emotion);
	}
	public void supprimer_force_caractere(String force) {
		this.getForce_caractere().remove(force);
	}
	
	//toString
	@Override
	public String toString() {
		return "Jour [date=" + date + ", fait=" + fait + ", emotion_passe=" + emotion_passe + ", emotion_present="
				+ emotion_present + ", force_caractere=" + force_caractere + "]";
	}
	
	
	
	
}
