package main.java.leetcode.solution;

import java.util.Arrays;

import main.java.leetcode.common.util.UnionFind;

public class RedundantConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = {{1,2},{1,3},{2,3}};
		UnionFind uf = new UnionFind(edges.length);
		for(int[] edge : edges) {
			if(uf.isSameGroup(edge[0], edge[1])) {
				System.out.println(Arrays.toString(edge));
				return;
			}
			uf.union(edge[0], edge[1]);
		}
	}

}
