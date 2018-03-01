
public class Ride {
	
	private Point start;
	private Point end;
	private int earliestStart;
	private int latestFinish;
	private int spareTime;
	
	
	public Ride(int startX, int startY, int endX, int endY, int earliestStart, int latestFinish) {
		super();
		this.start.setX(startX);
		this.start.setY(startY);
		this.end.setX(endX);
		this.end.setY(endY);
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
		this.spareTime = latestFinish - earliestStart - distanceBetween(start, end);
	}

	public Ride() {
		
	}
	public Point getStart() {
		return this.start;
	}
	
	public Point getEnd() {
		return this.end;
	}

	public int distanceBetween(Point a, Point b) {
		return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
	}
	
	public int getStartX() {
		return start.getX();
	}


	public void setStartX(int startX) {
		this.start.setX(startX);
	}


	public int getStartY() {
		return start.getY();
	}


	public void setStartY(int startY) {
		this.start.setY(startY);
	}


	public int getEndX() {
		return end.getX();
	}


	public void setEndX(int endX) {
		this.end.setX(endX);
	}


	public int getEndY() {
		return end.getY();
	}


	public void setEndY(int endY) {
		this.end.setY(endY);
	}


	public int getEarliestStart() {
		return earliestStart;
	}


	public void setEarliestStart(int earliestStart) {
		this.earliestStart = earliestStart;
	}


	public int getLatestFinish() {
		return latestFinish;
	}


	public void setLatestFinish(int latestFinish) {
		this.latestFinish = latestFinish;
	}
	
	
	

}

