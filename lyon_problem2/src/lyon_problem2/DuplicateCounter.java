package lyon_problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	catch (IOException error) {
    System.err.println("Yay I caught IOException:"+ error.getMessage());
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
       return;
}
  
   public void write(String outputFile){
	   try {
	   FileWriter writer = new FileWriter(outputFile);
       for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
           writer.write("Word:"+entry.getKey() + "\n"+ "Count:"+entry.getValue() + "\n");
           writer.write("\n");
       }
       Scanner out = new Scanner(new File(outputFile));
       for(String i : wordCounter.keySet()) {
           System.out.println("Word:"+i);
           System.out.println("Count:" + wordCounter.get(i));
           System.out.println();
       }
       out.close();
       writer.close();
       return;
	   }
       catch (IOException error) {
    	   System.err.println("Yay I caught IOException:"+ error.getMessage());
    	   return;
       }
	   
   }
  
}