package main.java.challenge.solution;

import java.util.ArrayList;
import java.util.List;
//Time O(n2 * 6 where 6 is the possibilities) Space: n where n is the length of the nums 
public class Points24 {

	public static void main(String[] args) {
		int[] nums = {4, 1, 8, 7};
		System.out.println(canGet24(nums));
	}
	
	static boolean canGet24(int[] nums) {
		List<Double> lst = new ArrayList<>();
		for(int num : nums)
			lst.add((double)num);
		return dfs(lst);
	}
	
	static boolean dfs(List<Double> lst) {
		if(lst.size() == 1) {
			if(Math.abs(lst.get(0) - 24.0) < 0.0001){
				return true;
			}else {
				return false;
			}
		}
		
		for(int i=0;i<lst.size();i++) {
			for(int j=i+1;j<lst.size();j++) {
				for(Double res : getResult(lst.get(i), lst.get(j))) {
					List<Double> nextRound = new ArrayList<>();
					nextRound.add(res);
					for(int k=0;k<lst.size();k++) {
						if(k==i || k==j)
							continue;
						nextRound.add(lst.get(k));
					}
					if(dfs(nextRound))
						return true;
				}
			}
		}
		return false;
	}
	
	static List<Double> getResult(Double a, Double b){
		List<Double> res = new ArrayList<>();
		res.add(a+b);
		res.add(a-b);
		res.add(b-a);
		res.add(a*b);
		res.add(a/b);
		res.add(b/a);
		return res;
	}
	
	
	

}
