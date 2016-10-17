package matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixDojo {

	public static int[][] matrix = new int[][] { { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 }, { 1, 2, 3, 4, 5 },
			{ 9, 21, 28, 49, 53 }, { 19, 18, 17, 16, 15 } };

	public static final int[][] DIRECTIONS = new int[][] { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 },
			{ 1, -1 }, { 1, 0 }, { 1, 1 } };

	public static int[] getNeighbours(int x, int y) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < DIRECTIONS.length; i++) {
			int di = DIRECTIONS[i][0] + x;
			int dj = DIRECTIONS[i][1] + y;
			if (di >= 0 && dj >= 0 && di <= matrix.length && dj < matrix[0].length)
				numbers.add(matrix[di][dj]);
		}
		int[] result = new int[numbers.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = numbers.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] result = getNeighbours(1, 4);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
