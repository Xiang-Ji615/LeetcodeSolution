package main.java.leetcode.solution;

import java.util.Map;
import java.util.TreeMap;

public class HandOfStraights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hand = {1,2,3,6,2,3,4,7,8};
		int W = 3;
		isNStraightHand(hand, W);
	}

	public static boolean isNStraightHand(int[] hand, int W) {
		Map<Integer, Integer> c = new TreeMap<>();
		for (int i : hand)
			c.put(i, c.getOrDefault(i, 0) + 1);
		for (int it : c.keySet())
			if (c.get(it) > 0)
				for (int i = W - 1; i >= 0; --i) {
					if (c.getOrDefault(it + i, 0) < c.get(it))
						return false;
					c.put(it + i, c.get(it + i) - c.get(it));
					System.out.println(c);
				}
		return true;
	}

}
