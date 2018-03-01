
public class Car {

	private Point position;
	private int availableTurn;
	
	
	
	public Car(Point position, int availableTurn) {
		super();
		this.position = position;
		this.availableTurn = availableTurn;
	}
	
	public Car() {
		this.position.setX(0);
		this.position.setY(0);
		this.availableTurn = 0;
	}
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public int getAvailableTurn() {
		return availableTurn;
	}
	public void setAvailableTurn(int availableTurn) {
		this.availableTurn = availableTurn;
	}
	
	
}
