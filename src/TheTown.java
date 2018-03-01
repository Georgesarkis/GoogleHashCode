import java.util.ArrayList;

public class TheTown {

	private int rows;
	private int columns;
	private int vehicles;
	private int rides;
	private int bonus;
	private int steps;
	private ArrayList<Ride> rideList;
	public TheTown(int rows, int columns, int vehicles, int rides, int bonus, int steps, ArrayList<Ride> rideList) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.vehicles = vehicles;
		this.rides = rides;
		this.bonus = bonus;
		this.steps = steps;
		this.rideList = rideList;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int getVehicles() {
		return vehicles;
	}
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	public int getRides() {
		return rides;
	}
	public void setRides(int rides) {
		this.rides = rides;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
	public ArrayList<Ride> getRideList() {
		return rideList;
	}
	public void setRideList(ArrayList<Ride> rideList) {
		this.rideList = rideList;
	}
}
