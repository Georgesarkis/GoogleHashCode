package hashcode;

public class LengthCounter {
	public int distence(int startx, int starty, int endx , int endy) {
		int length = 0;
		int x = Math.abs(startx - endx);
		int y = Math.abs(starty - endy);
		length = x+y;
		return length;
	}
}
