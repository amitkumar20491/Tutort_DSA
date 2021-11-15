package com.tutort.dsa;

/*
 * https://leetcode.com/problems/valid-tic-tac-toe-state
 */
public class Q14_ValidTicTacToeState {
	int x;
	int o;

	public boolean validTicTacToe(String[] board) {
		if (!isValidMoves(board)) {
			return false;
		}

		boolean isXWinner = checkForWinner(board, 'X');
		boolean isOWinner = checkForWinner(board, 'O');

		if (isXWinner && isOWinner) {
			return false;
		}

		if (isXWinner && x != o + 1) {
			return false;
		}

		if (isOWinner && x != o) {
			return false;
		}
		return true;
	}

	private boolean isValidMoves(String[] board) {
		for (String b : board) {
			for (char a : b.toCharArray()) {
				if (a == 'X') {
					x++;
				} else if (a == 'O') {
					o++;
				}
			}
		}

		return ((x == o) || (x == o + 1));
	}

	private boolean checkForWinner(String[] board, char a) {
		for (int i = 0; i < board.length; i++) {
			int count1 = 0;
			int count2 = 0;
			for (int j = 0; j < board[i].length(); j++) {
				if (board[j].charAt(i) == a) {
					count1++;
				}
				if (board[i].charAt(j) == a) {
					count2++;
				}
			}

			if (count1 == 3 || count2 == 3) {
				return true;
			}

		}

		if ((board[0].charAt(0) == a && board[1].charAt(1) == a && board[2].charAt(2) == a)
				|| (board[0].charAt(2) == a && board[1].charAt(1) == a && board[2].charAt(0) == a)) {
			return true;
		}
		return false;
	}
}
