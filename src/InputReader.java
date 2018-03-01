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
		String rows = "";
		String columns = "";
		String vehicles = "";
		String rides = "";
		String bonus = "";
		String steps = "";
        int lineCount = 0;
        while ((line = br.readLine()) != null) {
        		lineCount++;
        		if(lineCount == 1) {
        			int counter = 0;
        			for(int i = 0; i < line.length(); i++) {
        				if(line.charAt(i) == ' ') {
        					counter++;
        				}
        				switch(counter) {
	        				case 0:  { // rows
	        					rows += line.charAt(i);
	        					break;
	        				}
	        				case 1: {
	        					columns += line.charAt(i);
	        					break;
	        				}
	        				case 2: {
	        					vehicles += line.charAt(i);
	        					break;
	        				}
	        				case 3: {
	        					rides += line.charAt(i);
	        					break;
	        				}
	        				case 4: {
	        					bonus += line.charAt(i);
	        					break;
	        				}
	        				case 5: {
	        					steps += line.charAt(i);
	        					break;
	        				}
        				}
       
        			}
        			System.out.println("Rows: " + rows + "\nColumns: " + columns + "\nVehicles: " + vehicles + "\nRides: " + rides + "\nBonus: " + bonus + "\nSteps: " + steps);
        			
        		}
        		else { // Rides
        			
        		}
        		
        }
       
        TheTown town = new TheTown(Integer.parseInt(rows), Integer.parseInt(columns), Integer.parseInt(vehicles), Integer.parseInt(rides), Integer.parseInt(bonus), Integer.parseInt(steps), null);
        
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
