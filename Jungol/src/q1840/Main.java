package q1840;

import java.util.Scanner;

public class Main {
	static int[][] board;
	static int[][] visited;
	static int row;
	static int col;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		board = new int[row][col];
		visited = new int[row][col];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
				visited[i][j] = 0;
			}
		}
//		show_board();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int time = 0;
		int count = 0;
		do {
//			System.out.println("TIME : " + time);
			init_visited();
//			show_board();
//			show_visited();
			visit(0, 0);
//			System.out.println("++++++++++++++++++++++++++++++++++++++");
//			show_board();
//			show_visited();
			count = count_cheese();
			melt();
			time++;
		} while (is_there_cheese());
		System.out.println(time);
		System.out.println(count);
	}

	public static int count_cheese() {
		int cnt = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 2)
					cnt++;
			}
		}
		return cnt;
	}

	public static boolean is_there_cheese() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public static void melt() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 2) {
					board[i][j] = 0;
				}
			}
		}
	}

	public static void visit(int y, int x) {
		visited[y][x] = 1;
		if (board[y][x] == 1) {
			board[y][x] = 2;
			return;
		}

		// UP
		if (y - 1 >= 0 && visited[y - 1][x] == 0)
			visit(y - 1, x);
		// DOWN
		if (y + 1 < row && visited[y + 1][x] == 0)
			visit(y + 1, x);
		// LEFT
		if (x - 1 >= 0 && visited[y][x - 1] == 0)
			visit(y, x - 1);
		// RIGHT
		if (x + 1 < col && visited[y][x + 1] == 0)
			visit(y, x + 1);
	}

	public static void show_board() {
		System.out.println("board ARRAY ----------");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void show_visited() {
		System.out.println("visited ARRAY ----------");
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void init_visited() {
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				visited[i][j] = 0;
			}
		}
	}
}