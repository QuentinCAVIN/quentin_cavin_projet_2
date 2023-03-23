
package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) { //Constructeur
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() { //methode "obligatoire" qui est dans l'interface, elle renvoie une liste
                                      
		ArrayList<String> result = new ArrayList<String>(); // on crée une nouvelle liste
		
		if (filepath != null) {// si le fichier n'est pas vide on fait:
			try {//tant qu'il n'y a pas d'erreur
				BufferedReader reader = new BufferedReader (new FileReader(filepath)); 
        //// Création d’un bufferedReader qui utilise le fileReader qui utilise le filepath(=Chemin d'accès)
				String line = reader.readLine(); // lit la prochaine ligne

				while (line != null) { // Tant que la ligne n'est pas vide: (Donc la boulce s'arréte si il ya un simple blanc? Non une ligne blanche n'est pas null)
					result.add(line); // ajoute la ligne à la list result
					line = reader.readLine(); //lit la prochaine ligne

				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}