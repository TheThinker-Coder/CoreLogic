package core;
import java.util.Scanner;
public class SearchingChallenge {

    public static int SearchForHoles(String[] strArr) {
        boolean[][] visited = new boolean[strArr.length][strArr[0].length()];
        int count = 0;
        int numRows = strArr.length;
        int numCols = strArr[0].length();

        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < numCols; ++j) {
                if (strArr[i].charAt(j) == '0' && !visited[i][j]) {
                    ++count;
                    dfs(strArr, visited, i, j, numRows, numCols);
                }
            }
        }
        return count;
    }

    public static void dfs(String[] strArr, boolean[][] visited, int row, int col, int numRows, int numCols) {
        if (row < 0 || row >= numRows || col < 0 || col >= numCols || strArr[row].charAt(col) == '1' || visited[row][col]) {
            return;
        }
        visited[row][col] = true;
        dfs(strArr, visited, row - 1, col, numRows, numCols);
        dfs(strArr, visited, row + 1, col, numRows, numCols);
        dfs(strArr, visited, row, col - 1, numRows, numCols);
        dfs(strArr, visited, row, col + 1, numRows, numCols);
    }

    public static void main(String[] args) {
        String[] strArr = {"01111", "01101", "00011", "11110"};
        System.out.println(SearchForHoles(strArr));
    }
}
