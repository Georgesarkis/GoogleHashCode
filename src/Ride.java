
public class Ride {
	
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	private int earliestStart;
	private int latestFinish;
	
	
	public Ride(int startX, int startY, int endX, int endY, int earliestStart, int latestFinish) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
	}


	public int getStartX() {
		return startX;
	}


	public void setStartX(int startX) {
		this.startX = startX;
	}


	public int getStartY() {
		return startY;
	}


	public void setStartY(int startY) {
		this.startY = startY;
	}


	public int getEndX() {
		return endX;
	}


	public void setEndX(int endX) {
		this.endX = endX;
	}


	public int getEndY() {
		return endY;
	}


	public void setEndY(int endY) {
		this.endY = endY;
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
