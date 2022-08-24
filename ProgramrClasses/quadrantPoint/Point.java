package quadrantPoint;

public class Point {
	
	private int x;
	private int y;	
	
	public Point(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	private void setX(int x) {
		this.x = x;		
	}
	private void setY(int y) {
		this.y = y;		
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public int quadrant(){
		boolean qd1 = (x > 0 && y > 0);
		boolean qd2 = (x < 0 && y > 0);
		boolean qd3 = (x < 0 && y < 0);
		boolean qd4 = (x > 0 && y < 0);
		if(qd1){
			return 1;
		} else if (qd2){
			return 2;
		} else if (qd3){
			return 3;
		} else if (qd4){
			return 4;
		}
		
		return 0;
	}
}
