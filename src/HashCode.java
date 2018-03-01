import java.util.ArrayList;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheTown town = InputReader.fetch();
		
		ArrayList<Ride> rideList = town.getRideList();
		for(int i=0; i < rideList.size(); i++) {
			System.out.println("[" + rideList.get(i).getStartX() + "," + rideList.get(i).getStartY() + "]" );
		}
		
	}

}
