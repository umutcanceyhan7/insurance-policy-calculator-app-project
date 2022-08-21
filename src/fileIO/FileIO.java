package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	
	/**
	 * @return 2d list with the values in the file.
	 * @throws FileNotFoundException
	 */
	public int countFileRow(String filename) throws FileNotFoundException {
		Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
		int rowCount = 0;
		while(sc.hasNext()) {
			rowCount++;
			sc.nextLine();
		}
		return rowCount;
	}
	public ArrayList<ArrayList<Object>> getinsuredValuePropertiesList(String filename) throws FileNotFoundException 
	{     
		 	
		  Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
	      int fileRowCount = this.countFileRow(filename);	
	      ArrayList<ArrayList<Object>> insuredValuePropertiesList = new ArrayList<ArrayList<Object>>(fileRowCount);
	      while(sc.hasNextLine()) {
	         for (int i=0; i<fileRowCount; i++) {
	            String[] line = sc.nextLine().trim().split(",");
	            insuredValuePropertiesList.add(new ArrayList<Object>());
	            
	            for (int j=0; j<line.length; j++) {
	                // Capitalizes word's first letter 
	            	String capitilizedWord = line[j].substring(0,1).toUpperCase() + line[j].substring(1).toLowerCase();
	            	// Add words insuredValuePropertiesList into insuredValuesList.
	            	insuredValuePropertiesList.get(i).add(capitilizedWord);
	            	}
	         	}
	      }
	   sc.close();
	   return insuredValuePropertiesList;
	   }

}
