import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class InputReader {
	
		
	public static TheTown fetch() {
		BufferedReader br = null;
	    ArrayList<Ride> rideList = new ArrayList<>();
	    String line;
		String rows = "";
		String columns = "";
		String vehicles = "";
		String rides = "";
		String bonus = "";
		String steps = "";
	    try {
	        br = new BufferedReader(new FileReader("resources\\a_example.in"));
	
	
			
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
	        			// Rides
	        			String startX = "";
	        			String startY = "";
	        			String endX = "";
	        			String endY = "";
	        			String earliestStart = "";
	        			String latestFinish = "";
	        			int counter = 0;
	        			for(int i = 0; i < line.length(); i++) {
	        				if(line.charAt(i) == ' ') {
	        					counter++;
	        				}
	        				switch(counter) {
		        				case 0:  { // rows
		        					startX += line.charAt(i);
		        					break;
		        				}
		        				case 1: {
		        					startY += line.charAt(i);
		        					break;
		        				}
		        				case 2: {
		        					endX += line.charAt(i);
		        					break;
		        				}
		        				case 3: {
		        					endY += line.charAt(i);
		        					break;
		        				}
		        				case 4: {
		        					earliestStart += line.charAt(i);
		        					break;
		        				}
		        				case 5: {
		        					latestFinish += line.charAt(i);
		        					break;
		        				}
	        				}
	        		}
	    	        Ride ride = new Ride(Integer.parseInt(startX.trim()), Integer.parseInt(startY.trim()), Integer.parseInt(endX.trim()), Integer.parseInt(endY.trim()), Integer.parseInt(earliestStart.trim()), Integer.parseInt(latestFinish.trim()));
	    	        rideList.add(ride);
	        	}
	        }
	       
	    } catch (IOException e) { e.printStackTrace(); } 
	    
	    
	    finally {
	        try {
	            if (br != null) {
	                br.close();
	            }
	        } catch (IOException ex) { ex.printStackTrace(); }
		  }
	    TheTown town = new TheTown(Integer.parseInt(rows.trim()), Integer.parseInt(columns.trim()), Integer.parseInt(vehicles.trim()), Integer.parseInt(rides.trim()), Integer.parseInt(bonus.trim()), Integer.parseInt(steps.trim()), rideList);
		return town;
		}
}
