package main.java.challenge.solution;

public class MinDeliveryDistance {

	static Point START = new Point(0, 0);
	static int minPath = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points = { new Point(2, 2), new Point(2, 8), new Point(4,  4), new Point(7, 2)};
		System.out.println(calcu(START, points, 0, 0));
	}
	
	public static int calcu(Point start, Point[] points, int sum, int cnt) {
		if(cnt == points.length)
			minPath = Math.min(sum + start.getLength(START), minPath);
		else {
			for(int i=0;i<points.length;i++) {
				if(points[i].visited == false) {
					sum += points[i].getLength(start);
					if(sum < minPath) {
						points[i].visited = true;
						calcu(points[i], points, sum, cnt+1);
					}
					sum -= points[i].getLength(start);
					points[i].visited = false;
				}
			}
		}
		return minPath;
	}

}

class Point{
	int x;
	int y;
	boolean visited;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getLength(Point B) {
		return Math.abs(x - B.x) + Math.abs(y - B.y);
	}
}
