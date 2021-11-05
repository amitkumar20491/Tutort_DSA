package com.tutort.dsa.class4;

/*
 * https://leetcode.com/problems/prison-cells-after-n-days/  
 */
public class PrisionCell {
	/*
	 * Brute force : Time limit exceeded
	 */

	public int[] prisonAfterNDays(int[] cells, int n) {
		int length = cells.length;
		int[] state;
		for (int i = 1; i <= n; i++) {
			state = new int[length];
			System.arraycopy(cells, 0, state, 0, length);
			for (int j = 1; j < length - 1; j++) {
				cells[j] = state[j - 1] ^ state[j + 1];
			}
			cells[0] = 0;
			cells[length - 1] = 0;
		}

		return cells;
	}
}
