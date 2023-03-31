package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
*Class who count and sort symptoms. 
*/
public class AnalyticsCounter {

  private ISymptomReader reader;
  private ISymptomWriter writer;

  /**
  *constructor of AnalyticsCounter.
  *
  *@param reader object who read data from a file
  *@param writer object who write data into a file
  */
  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) { 
    this.reader = reader; 
    this.writer = writer;
  }

  public List<String> getSymptoms() {
    return reader.getSymptoms();
  }

  /**
  *Count the numbers of symptoms's occurence.
  *
  *@param symptoms a list of symptoms in any order
  *@return a map of symptoms, in which key = Symptoms, value = number of symptoms
  */
  public Map<String, Integer> countSymptoms(List<String> symptoms) { 
    Map<String, Integer> mapSymptoms = new HashMap<String, Integer>();

    for (String s : symptoms) {
      if (mapSymptoms.get(s) == null) {
        mapSymptoms.put(s, 1);
      } else {
        mapSymptoms.put(s,(mapSymptoms.get(s) + 1));
      }
    }

    return mapSymptoms;
  } 

  /**
  *Order a map by natural order.
  *
  *@param symptoms a map to sort
  *@return a map sort by natural order 
  */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
    Map sortSymptoms = new TreeMap(symptoms);
    return sortSymptoms; 
  }

  /**
  *Use the writer object to write in a file.
  *
  *@param symptoms the map to write
  */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
  } 
}