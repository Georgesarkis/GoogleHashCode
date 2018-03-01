import java.util.ArrayList;

public class HashCode {

	private static TheTown town = InputReader.fetch();
	private static ArrayList<Ride> rideList = town.getRideList();
	private static ArrayList<Car> carList = new ArrayList<>(town.getVehicles());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < town.getVehicles(); i++) {
			Car car = new Car();
			carList.add(car);
		}
		for (int i = 0; i < town.getSteps(); i++) {
			getAvailableCars(i);			
		}
		for(int i=0; i < rideList.size(); i++) {
			System.out.println("[" + rideList.get(i).getStartX() + "," + rideList.get(i).getStartY() + "]" );
		}
		
		
		
	}
	
	public static int distanceBetween(Point a, Point b) {
		return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
	}
	
	public static void getAvailableCars(int curr_turn) {
		
		for (int i = 0; i < carList.size(); i++) {
			Car car = carList.get(i);
			if(car.getAvailableTurn() <= curr_turn) {
				assignCars(car ,curr_turn);
			}
		}
		
	}

	
	public static void assignCars(Car car, int curr_turn) {
		int mostUrgent = Integer.MAX_VALUE;
		int totalTime = 0;
		Ride urgentRide = new Ride();
		for (int j = 0; j < rideList.size(); j++) {
			Ride ride = rideList.get(j);
			int distanceToStart = distanceBetween(car.getPosition(), rideList.get(j).getStart());
			int waitTime = ride.getEarliestStart() - curr_turn;
			
			totalTime = distanceToStart + distanceBetween(ride.getStart(), ride.getEnd()) + waitTime;
			
			int urgency = ( ride.getLatestFinish() - ride.getEarliestStart() ) - distanceBetween(ride.getStart(), ride.getEnd()) - distanceToStart;
			if(mostUrgent > urgency && urgency > 0) {
				mostUrgent = urgency;
				urgentRide = ride;
		}
	}
		car.setAvailableTurn(totalTime + curr_turn);
		car.setPosition(urgentRide.getEnd());
		System.out.println(car.getAvailableTurn());
		System.out.println(car.getPosition().toString());
} 
	}













