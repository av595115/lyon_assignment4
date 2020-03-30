package lyon_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter{
	

private Map<String,Integer> wordCounter;
  
public DuplicateCounter(){
      wordCounter = new HashMap<String,Integer>();
}
  
public void count(String dataFile){
	Scanner in;
	
	try {
		in = new Scanner(new File(dataFile));
}
	catch (FileNotFoundException error) {
    System.err.println("Yay I caught FileNotFoundException:"+ error.getMessage());
    return;
    
    }
	
    while(in.hasNext()) {
    	   
           String word = in.next().toLowerCase();
           Integer count = wordCounter.get(word);
           if(count == null)
               count = 1;
           else
               count = count + 1;
           wordCounter.put(word, count);
           
       }
       in.close();
}
  
   public void write(String outputFile){
       try {
           Scanner out = new Scanner(new File(outputFile));
           for(String i : wordCounter.keySet()) {
               System.out.println("Word:"+i);
               System.out.println("Count:" + wordCounter.get(i));
               System.out.println();
           }
           out.close();
       }
       
       catch (FileNotFoundException error) {
    	   System.err.println("Yay I caught FileNotFoundException:"+ error.getMessage());
    	   return;
       }
   }
  
}