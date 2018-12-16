package main.java.leetcode.common.util;

public class UnionFind {

	int[] id;
	int cnt;
	
	public UnionFind(int n) {
		id = new int[n+1];
		for(int i=0;i<=n;i++) {
			id[i] = i;
		}
		cnt = n;
	}
	
	public int find(int i) {
		if(id[i] == i)
			return i;
		return find(id[i]);
	}
	
	public int count() {
		return cnt;
	}
	
	public void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		if(rootX == rootY) return;
		id[rootX] = rootY; 
		cnt--;
	}
	
	public boolean isSameGroup(int x, int y) {
		return find(x) == find(y);
	}
}
