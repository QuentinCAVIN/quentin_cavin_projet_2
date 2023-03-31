package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * Write data in a file "result.out"
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

  /**
  * write in a file name "result.out" all entry K/V obtained from a map object
  *
  * @param symptoms a map object who contains the symptoms to write
  */
  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) { 
  
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("result.out"));
  
      for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {  
        writer.write(entry.getKey() + " : " +  entry.getValue());
        writer.newLine();  
      }

      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}