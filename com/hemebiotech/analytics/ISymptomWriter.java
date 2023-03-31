package com.hemebiotech.analytics;

import java.util.Map;

/**
 *Write a map of symptoms in a file, in which key = Symptoms, value = number of symptoms.
 */
public interface ISymptomWriter {
  /**
  * Write in a file all entry K/V obtained from a map object.
  *
  *@param symptoms a map object who contains the symptoms to write
  */
  public void writeSymptoms(Map<String, Integer> symptoms);

}