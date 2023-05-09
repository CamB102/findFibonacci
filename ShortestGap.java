package algorithmday1;

import java.util.*;

public class ShortestGap {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		int x = 7;
		int idx1 = -1, idx2 = -1,  minGap = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				if (idx1 != -1) {
					int gap = i - idx1;
					if (gap < minGap) {
						minGap = gap;
						idx2 = i;
					}
				} else {
					idx1 = i;
				}
			}
		}
		if (idx1 == -1 || idx2 == -1) {
			System.out.println("Pair not found");
		} else {
			System.out.println("Pair: (" + x + ", " + x + ")");
			System.out.println("Distance: " + minGap);
			System.out.println("Indices: " + idx1 + ", " + idx2);
		}
	}

}
