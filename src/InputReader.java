import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class InputReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fetch();


	}

	
public static void fetch() {
	BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader("resources\\a_example.in"));
        String line;
        String output ="";
        int lineCount = 0;
        while ((line = br.readLine()) != null) {
        		lineCount++;
        		if(lineCount == 1) {
        			int counter = 0;
        			String rows = 0;
        			String columns = 0;
        			String vehicles = 0;
        			String rides = 0;
        			String bonus = 0;
        			String steps = 0;
        			for(int i = 0; i < line.length(); i++) {
        				if(line.charAt(i) == ' ') {
        					counter++;
        				}
        				switch(counter) {
        				case 0:  { // rows
        					rows += line.charAt(i)
        				}
        				case 1: {
        					columns += line.charAt(i);
        				}
        				case 2: {
        					vehicles += line.charAt(i);
        				}
        				case 3: {
        					rides += line.charAt(i);
        				}
        				case 4: {
        					line.charAt(i);
        				}
        				
        				
        				}
        
        			}
        			
        		}
        		
        }
       
        //System.out.println(output);
        
    } catch (IOException e) { e.printStackTrace(); } 
    
    
    finally {
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException ex) { ex.printStackTrace(); }
	  }
	}
}
