package main.java.challenge.solution;

import java.util.ArrayList;
import java.util.List;

public class MinDeliveryDistance {

	static Point START = new Point(0, 0);
	static int minPath = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points = { new Point(1, 4), new Point(2, 2), new Point(3,  1), new Point(5, 3)};
		System.out.println(calcu(START, points, 0, 0, new ArrayList<>()));
	}
	
	public static int calcu(Point p, Point[] points, int sum, int cnt, List<Point> path) {
		if (cnt == points.length) {
			minPath = Math.min(minPath, sum + p.getLength(START));
			System.out.println(path);
		}
		for(int i=0;i<points.length;i++) {
			if(points[i].visited == false) {
				sum += points[i].getLength(p);
				if(sum < minPath) {
					points[i].visited = true;
					path.add(points[i]);
					calcu(points[i], points, sum, cnt+1, path);
					path.remove(path.size() - 1);
				}
				sum -= points[i].getLength(p);
				points[i].visited = false;
			}
		}
//		System.out.println(path);
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point: "+ x +" : "+ y;
	}
	
	
}
