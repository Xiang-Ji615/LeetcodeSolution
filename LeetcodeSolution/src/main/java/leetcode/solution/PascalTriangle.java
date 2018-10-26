package main.java.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(10);
	}

	static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> row = new ArrayList<>();
		for(int i=0;i<numRows;i++) {
			row.add(0,1);
			for(int j=1; j<row.size()-1;j++) {
				row.set(j, row.get(j)+row.get(j+1));
			}
			System.out.println(row);
			res.add(new ArrayList<>(row));
		}
		return res;
	}

}
