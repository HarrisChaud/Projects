package TicTacToe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TTT {

	public static void main(String[] args) {
		String[][] board = update();
	}

	public static int getCount(String[][] board, String element) {
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals(element)) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void printBoard(String[][] board) {
		String s = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals("")) {
					s += "_";
				}
				s += board[i][j];
			}

		}
		String strSplit[] = s.split("");
		System.out.println("---------");
		System.out.println("| " + strSplit[0] + " " + strSplit[1] + " " + strSplit[2] + " |");
		System.out.println("| " + strSplit[3] + " " + strSplit[4] + " " + strSplit[5] + " |");
		System.out.println("| " + strSplit[6] + " " + strSplit[7] + " " + strSplit[8] + " |");
		System.out.println("---------");
	}

	public static String[][] generateTable() {
		String[] strSplit = { " ", " ", " ", " ", " ", " ", " ", " ", " " };
		System.out.println("---------");
		System.out.println("| " + strSplit[0] + " " + strSplit[1] + " " + strSplit[2] + " |");
		System.out.println("| " + strSplit[3] + " " + strSplit[4] + " " + strSplit[5] + " |");
		System.out.println("| " + strSplit[6] + " " + strSplit[7] + " " + strSplit[8] + " |");
		System.out.println("---------");
		String board[][] = new String[3][3];

		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = strSplit[count];
				count++;
			}
		}
		return board;
	}

	public static String[][] update() throws ArrayIndexOutOfBoundsException {
		boolean ok = false;
		boolean valid = false;
		boolean occ = false;
		boolean xTurn = true;
		boolean oTurn = true;
		String[][] board = generateTable();
		Scanner scanner = new Scanner(System.in);

		while (!ok || !valid || !occ) {
			System.out.print("Enter the coordinates ");
			String input = scanner.nextLine();
			int first = 0;
			int second = 0;

			try {
				first = Integer.parseInt(String.valueOf(input.charAt(0)));
				second = Integer.parseInt(String.valueOf(input.charAt(2)));
				if ((first < 1 || first > 3) || (second < 1 || second > 3)) {
					System.out.println("Coordinates should be from 1 to 3!");
				} else {
					valid = true;
				}
				ok = true;
				try {
					if (!board[first - 1][second - 1].equals(" ")) {
						System.out.println("This cell is occupied! Choose another one!");
					}
					if (board[first - 1][second - 1].equals(" ") && xTurn == true) {
						board[first - 1][second - 1] = "X";
						printBoard(board);
						xTurn = false;
						oTurn = true;

						if (getWinner(board).equals("X wins") || getWinner(board).equals("O wins")) {
							System.out.println(getWinner(board));
							break;
						}
					}

					if (board[first - 1][second - 1].equals(" ") && oTurn == true) {
						board[first - 1][second - 1] = "O";
						printBoard(board);
						xTurn = true;
						oTurn = false;
						if (getWinner(board).equals("X wins") || getWinner(board).equals("O wins")) {
							System.out.println(getWinner(board));
							break;
						}
					}

				} catch (ArrayIndexOutOfBoundsException ae) {
				}
			} catch (NumberFormatException ae) {
				System.out.println("You should enter numbers!");
			}
		}
		return board;
	}

	public static String validCol(String board[][], int row) {
		String ret[] = { "", "", "" };
		String winner = "";
		try {
			for (int i = 0; i < board.length; i++) {
				ret[i] = board[i][row];
			}
		} catch (ArrayIndexOutOfBoundsException aio) {
			System.out.println("You can only input cols of 0-2");
		}
		HashSet<String> set = new HashSet<>(Arrays.asList(ret));

		if (set.contains("X") && set.size() == 1) {
			winner = "X wins";
		}
		if (set.contains("O") && set.size() == 1) {
			winner = "O wins";
		}
		return winner;
	}

	public static String validRow(String board[][], int col) {
		String ret[] = { "", "", "" };
		try {
			for (int i = 0; i < board.length; i++) {
				ret[i] += board[col][i];
			}
		} catch (ArrayIndexOutOfBoundsException aio) {
			System.out.println("You can only input rows of 0-2");
		}

		HashSet<String> set = new HashSet<>(Arrays.asList(ret));
		String winner = "";
		if (set.contains("X") && set.size() == 1) {
			winner = "X wins";
		}
		if (set.contains("O") && set.size() == 1) {
			winner = "O wins";
		}
		return winner;
	}

	public static String validDiag(String board[][]) {
		String ret[] = { "", "", "" };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					ret[i] += board[i][j];
				}
			}
		}
		HashSet<String> set = new HashSet<>(Arrays.asList(ret));
		String winner = "";
		if (set.contains("X") && set.size() == 1) {
			winner = "X wins";
		}
		if (set.contains("O") && set.size() == 1) {
			winner = "O wins";
		}
		return winner;
	}

	public static String validDiagRev(String[][] board) {
		String ret[] = { "", "", "" };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i + j) == (3 - 1)) {
					ret[i] += board[i][j];
				}
			}
		}
		HashSet<String> set = new HashSet<>(Arrays.asList(ret));
		String winner = "";
		if (set.contains("X") && set.size() == 1) {
			winner = "X wins";
		}
		if (set.contains("O") && set.size() == 1) {
			winner = "O wins";
		}
		return winner;
	}

	public static String getWinner(String[][] board) {
		String winner = "";
//	        System.out.println(getCount(board, "X") - getCount(board, "O"));
//	        System.out.println(getCount(board, "O") - getCount(board, "X"));

		if ((validCol(board, 0).equals("X wins") || validCol(board, 1).equals("X wins")
				|| validCol(board, 2).equals("X wins") || validRow(board, 0).equals("X wins")
				|| validRow(board, 1).equals("X wins") || validRow(board, 2).equals("X wins")
				|| validDiag(board).equals("X wins") || validDiagRev(board).equals("X wins"))
				&& (validCol(board, 0).equals("O wins") || validCol(board, 1).equals("O wins")
						|| validCol(board, 2).equals("O wins") || validRow(board, 0).equals("O wins")
						|| validRow(board, 1).equals("O wins") || validRow(board, 2).equals("O wins")
						|| validDiag(board).equals("O wins") || validDiagRev(board).equals("O wins"))) {
			winner = "Impossible";
		} else if (validCol(board, 0).equals("X wins") || validCol(board, 1).equals("X wins")
				|| validCol(board, 2).equals("X wins") || validRow(board, 0).equals("X wins")
				|| validRow(board, 1).equals("X wins") || validRow(board, 2).equals("X wins")
				|| validDiag(board).equals("X wins") || validDiagRev(board).equals("X wins")) {
			winner = "X wins";
		} else if (validCol(board, 0).equals("O wins") || validCol(board, 1).equals("O wins")
				|| validCol(board, 2).equals("O wins") || validRow(board, 0).equals("O wins")
				|| validRow(board, 1).equals("O wins") || validRow(board, 2).equals("O wins")
				|| validDiag(board).equals("O wins") || validDiagRev(board).equals("O wins")) {
			winner = "O wins";
		} else if (getCount(board, "X") + getCount(board, "O") == 9) {
			winner = "Draw";
		} else if (Math.abs(getCount(board, "X") - getCount(board, "O")) > 1) {
			winner = "Impossible";
		} else {
			winner = "Game not finished";
		}
		return winner;
	}
}
