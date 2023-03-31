package com.hemebiotech.analytics;

import java.util.List;

/**
* Anything that will read symptom data from a source.
* The input source is a file with one symptom per line.
* 
* @see Symptom
*/
public interface ISymptomReader {

  /**
  * Read the symptoms from a data source and return them as a list of strings.
  *
  * @return A list of strings containing the symptoms obtained from the data source.
  */
  List<String> getSymptoms();
}