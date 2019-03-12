package main.java.challenge.solution;

public class MinDistanceWords {

	public static void main(String[] args) {
		String data = "AAAACABAA";
		System.out.println(findMinDistance('C', 'B', data));
	}
	
	//Naive solution  Time: O(n^2) Space: O(n)
	private static String findMinDistanceNaive(char a, char b, String data) {
		int len = Integer.MAX_VALUE;
		String res = "";
		int l = data.length();
		for(int i=0;i<l;i++) {
			int aIdx = data.charAt(i) == a ? i : -1;
			for(int j=0;j<l;j++) {
				int bIdx = data.charAt(j) == b ? j : -1;
				if(aIdx != -1 && bIdx != -1 && Math.abs(aIdx - bIdx) < len) {
					len = Math.abs(aIdx - bIdx);
					res = aIdx < bIdx ? data.substring(aIdx, bIdx + 1) : data.substring(bIdx, aIdx + 1);
				}
			}
		}
		return res;
	}

	//Sliding window solution Time: O(n) Space: O(n)
	private static String findMinDistance(char a, char b, String data) {
		int aIdx = -1;
		int bIdx = -1;
		int len = Integer.MAX_VALUE;
		String res = "";
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i) == a) {
				aIdx = i;
				if(bIdx != -1 && Math.abs(aIdx - bIdx) < len) {
					len = Math.abs(aIdx - bIdx) ;
					res = aIdx < bIdx ? data.substring(aIdx, bIdx+1) : data.substring(bIdx, aIdx+1);
				}
			}
			if(data.charAt(i) == b) {
				bIdx = i;
				if(aIdx != -1 && Math.abs(aIdx - bIdx) < len) {
					len = Math.abs(aIdx - bIdx) ;
					res = aIdx < bIdx ? data.substring(aIdx, bIdx+1) : data.substring(bIdx, aIdx+1);
				}
			}
		}
		
		return res;
	}
	
	
}
