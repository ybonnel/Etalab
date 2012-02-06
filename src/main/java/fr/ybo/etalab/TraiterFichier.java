package fr.ybo.etalab;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import fr.ybo.etalab.modele.Accident;
import fr.ybo.moteurcsv.MoteurCsv;

public class TraiterFichier {
	
	public static void export35() throws IOException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(Accident.class);
		MoteurCsv moteur = new MoteurCsv(classes);
		
		final List<Accident> accidents = new ArrayList<Accident>();
		
		System.out.println("Lecture du fichier.");
		
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(TraiterFichier.class.getResourceAsStream("/etalabv3met.csv")));
		
		moteur.parseFileAndInsert(bufReader, Accident.class,new MoteurCsv.InsertObject<Accident>() {

			public void insertObject(Accident objet) {
				if (objet.getDepartements() == null || objet.getDepartements().length() == 0) {
					System.err.println("Accident sans département détecté");
				} else if ("350".equals(objet.getDepartements())) {
					accidents.add(objet);
				}
			}
		} );
		
		bufReader.close();
		
		System.out.println("Ecriture du fichier de sortie");
		
		moteur.writeFile(new File("D:/sources/accidents.csv"), accidents, Accident.class);
	}
	
	public static void main(String[] args) throws IOException {
		export35();
	}

}
