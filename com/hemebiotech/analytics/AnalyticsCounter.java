package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class AnalyticsCounter {

  private ISymptomReader reader;
  private ISymptomWriter writer;

  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer){ //constructeur qui va prendre en parametre
    this.reader=reader;// un reader et un writer de type ReadSymptomDataFromFile et WriteSymptomDataToFile  
    this.writer=writer;// qui vont être utilisé dans la classe Main
  }

  public List<String> getSymptoms() {
		return reader.getSymptoms();  // on va lancer la methode getSymptom de la classe
	 }//ReadSymptomDataFromFile en lui donnant en parametre le filepath de notre variable reader(r)

  
  public Map<String, Integer> countSymptoms(List<String> symptoms) { // on la recupere comment la liste? countSymptoms(getSymptoms())?

    Map<String, Integer> mapSymptoms = new HashMap<String, Integer>();

        for (String s : symptoms) {

            if (mapSymptoms.get(s) == null) { //si l'entrée de liste est pas déja dans le map , on la met
                mapSymptoms.put(s, 1);

            } else {

                mapSymptoms.put(s,(mapSymptoms.get(s) + 1));// sinon on l'incrémente.
            }
        }
        return mapSymptoms;
  } 
    

  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 

        //censé trier les symptomes par ordre alphabetique mais une Map le fait déja de base de ce que j'ai pu voir.

    Map sortSymptoms = new TreeMap( symptoms);
    return sortSymptoms; 



        /*
        TreeMap(Map<? extends K,? extends V> m)
Constructs a new tree map containing the same mappings
 as the given map, ordered according to the natural ordering of its keys.
 Ordre naturel pour moi veux dire par ordre alphabetic.
 Aprés vérif ça fait la différence entre majuscule (avant) et minuscule (après)*/ 
  }



  public void writeSymptoms(Map<String, Integer> symptoms) {

    writer.writeSymptoms(symptoms);

   }


    


		



    /*symptoms.stream().forEach((String symptom) -> { //voir les lambdas
      println(symptom);
    });
    */





    
    //LE PLAN INITIAL
    //1 je crée un dictionnaire
    //2 pour chaque élements de la liste je crée une entrée dans le dictionnaire qui sera une key
    //3 on crée une variable par entrée du dictionnaire qui sera incrémenté a chaque apparition du meme element
     
  }


/*










	private static int headCount = 0;	
	private static int rashCount = 0;		
	private static int pupilCount = 0;	

	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		
		while (line != null) {
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
*/