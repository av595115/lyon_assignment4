package lyon_problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class DuplicateRemover {
	
private Set<String> uniqueWords;

public DuplicateRemover() {
   uniqueWords = new HashSet<>();
}

public void remove(String dataFile) {
	try {
		Scanner in = new Scanner(new File(dataFile));
  
	while (in.hasNext()) {
		uniqueWords.add(in.next());
   }
   in.close();
} 
	catch (IOException error) {
	  System.err.println("Yay I caught IOException:"+ error.getMessage());
	  return;
       }

   }

public void write(String outputFile) {

	
	try {
		FileWriter writer = new FileWriter(outputFile);
		Scanner uw = new Scanner(new File(outputFile));
		
		for(String uniqueWords: uniqueWords) {
		writer.write(uniqueWords);
		writer.write("\n");
		System.out.println(uniqueWords);
		}
		writer.close();
		uw.close();
		return;
} 
  
	catch (IOException error) {
		System.err.println("Yay I caught IOException:"+ error.getMessage());
		return;
      }
   }
}
