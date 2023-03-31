package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


public class Main {

  /**
  * Read a list of symptoms from a text file named "symptoms.txt", count and sort this list 
  * and finally Write it in a file "result.out"  
  */
  public static void main(String[]args) {

    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile();
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

    List<String> listSymptoms = analyticsCounter.getSymptoms();
    Map<String, Integer> mapSymptoms = analyticsCounter.countSymptoms(listSymptoms);
    Map<String, Integer> mapSymptomsSorted = analyticsCounter.sortSymptoms(mapSymptoms);
    analyticsCounter.writeSymptoms(mapSymptomsSorted);
  }

}

