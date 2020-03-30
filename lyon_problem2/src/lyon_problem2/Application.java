package lyon_problem2;

public class Application {
	   public static void main(String[] args) {
	       String dataFile = "problem2.txt";
	       String outputFile = "unique_word_counts.txt";
	       
	       DuplicateCounter duplicateCounter = new DuplicateCounter();
	       
	       duplicateCounter.count(dataFile);
	       duplicateCounter.write(outputFile);
	   }
	}