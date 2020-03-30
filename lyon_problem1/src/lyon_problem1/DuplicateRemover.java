package lyon_problem1;

import java.io.File;
import java.io.FileNotFoundException;
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
	catch (FileNotFoundException error) {
	  System.err.println("Yay I caught FileNotFoundException:"+ error.getMessage());
	  return;
       }

   }

public void write(String outputFile) {
	
	try {
		Scanner uw = new Scanner(new File(outputFile));
		
		for(String uniqueWords: uniqueWords) {
		System.out.println(uniqueWords);
		}
		
		uw.close();
		return;
} 
  
	catch (FileNotFoundException error) {
		System.err.println("Yay I caught FileNotFoundException:"+ error.getMessage());
		return;
      }
   }
}