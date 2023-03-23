package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;



public class WriteSymptomDataToFile implements ISymptomWriter {



  	/**
	 * 
	 * @param filepath a full or partial path to file in with occurrences of symptoms
	 */

	public WriteSymptomDataToFile (){ //constructeur vide pour régler le probléme de génération de l'erreur
	}// Ce serait une façon de faire courante

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) { 
    //Methode obligatoire de l'interface WriteSymptomDataToFile donc pas touche
		
		 
			try {//tant qu'il n'y a pas d'erreur
				BufferedWriter writer = new BufferedWriter (new FileWriter("result.out"));// pour faire fonctionner la vérification automatique. (sinon variable filepath)
        // Création d'un BufferedReader qui utilise FileWriter qui utilise la variable filepath
				
        // ajout d’un texte à notre fichier
        for (Map.Entry<String, Integer> entry : symptoms.entrySet()){  //"for each" entré de symptoms
					writer.write(entry.getKey() + " : " +  entry.getValue() );// on ecris dans le fichier la clé avec getKey et la valeur avec getValue
					writer.newLine();  // on va à la ligne
				}//regarder à faire la même avec keySet , plus fonctionel, plus lisible
        // tentative avec keyset:
        // writer.write(symptoms.keySet() + ":" + symptoms.values())

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
      
    }
	}
