package soin_3_pensees.gillian.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import soin_3_pensees.gillian.constantes.EMOTION_PASSE;
import soin_3_pensees.gillian.constantes.EMOTION_PRESENT;
import soin_3_pensees.gillian.model.Jour;

public class EcrireFichierExcel {

	public static void creerSouvenirFichierExcel(Jour jour){
		try {
			File file = new File("fichierxls/3pensées.xls");
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new HSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheetAt(0);
			int numrow=1;
			while(sheet.getRow(numrow)!=null){
				numrow+=1;
			}
			Row row = sheet.createRow(numrow);
			Cell cellDate = row.createCell(0, CellType.STRING);
			cellDate.setCellValue(jour.getJour());
			Cell cellFait = row.createCell(1, CellType.STRING);
			cellFait.setCellValue(jour.getFait());
			String emotion_passe="";
			for(EMOTION_PASSE emotion: jour.getEmotion_passe()) {
				emotion_passe=emotion_passe+emotion.name()+";";
			}
			Cell cellEmotionPasse= row.createCell(2, CellType.STRING);
			cellEmotionPasse.setCellValue(emotion_passe);
			String emotion_present="";
			for(EMOTION_PRESENT emotion: jour.getEmotion_present()) {
				emotion_present = emotion_present+emotion.name()+";";
			}
			Cell cellEmotionPresent= row.createCell(3, CellType.STRING);
			cellEmotionPresent.setCellValue(emotion_present);
			String force_caractere = "";
			for(String forceCaractere: jour.getForce_caractere()) {
				force_caractere = force_caractere+forceCaractere+";";
			}
			Cell cellForceCaractere= row.createCell(4, CellType.STRING);
			cellForceCaractere.setCellValue(force_caractere);
			inputStream.close();
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
			out.close();
			workbook.close();

		} catch (IOException e) {
			System.out.println(e.getClass()==java.io.FileNotFoundException.class);
			if(e.getClass()==java.io.FileNotFoundException.class)
			{
				try {
					OutputStream fichierXls = new FileOutputStream("fichierxls/3pensées.xls");
					fichierXls.close();  
					creerSouvenirFichierExcel(jour);
				} catch (IOException e1) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Attention");
					alert.setContentText("Une erreur est survenue");
					alert.showAndWait();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Attention");
				alert.setContentText("Une erreur est survenue");
				alert.showAndWait();
			}
		}
	}

	public static ArrayList<Jour> lireFichierExcel(){
		try {
			File file = new File("fichierxls/3pensées.xls");
			FileInputStream inputStream = new FileInputStream(file);
			HSSFWorkbook workbook;

			workbook = new HSSFWorkbook(inputStream);

			HSSFSheet sheet = workbook.getSheetAt(0);
			int numrow=1;
			ArrayList<Jour> jours=new ArrayList<Jour>();
			while(sheet.getRow(numrow)!=null){
				Jour jour=new Jour();
				jour.setJour(sheet.getRow(numrow).getCell(0).getStringCellValue());
				jour.setFait(sheet.getRow(numrow).getCell(1).getStringCellValue());
				for(String emotion:sheet.getRow(numrow).getCell(2).getStringCellValue().split(";")) {
					for (EMOTION_PASSE emotionPasse :EMOTION_PASSE.values())
						if(emotion.equals(emotionPasse.name())) {
							jour.ajouter_emotion_passe(emotionPasse);
						}

				}
				for(String emotion:sheet.getRow(numrow).getCell(3).getStringCellValue().split(";")) {
					for (EMOTION_PRESENT emotionPresent :EMOTION_PRESENT.values())
						if(emotion.equals(emotionPresent.name())) {
							jour.ajouter_emotion_present(emotionPresent);
						}

				}
				ArrayList<String> force_caracteres = new ArrayList<String>();
				for(String force_caractere:sheet.getRow(numrow).getCell(4).getStringCellValue().split(";")) {
					force_caracteres.add(force_caractere);
				}
				jour.setForce_caractere(force_caracteres);
				jours.add(jour);
				numrow+=1;
			}
			workbook.close();
			inputStream.close();
			return jours;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Jour>();


	}

}
