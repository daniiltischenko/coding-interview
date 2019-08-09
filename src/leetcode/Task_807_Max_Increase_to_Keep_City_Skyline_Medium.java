package leetcode;

public class Task_807_Max_Increase_to_Keep_City_Skyline_Medium {

  public static void main(String[] args) {
    System.out.println(maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}) == 35);
  }

  static int maxIncreaseKeepingSkyline(int[][] grid) {
    int result = 0;

    int[] maxVert = new int[grid.length];
    int[] maxHor = new int[grid.length];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        if (grid[i][j] > maxHor[j]) {
          maxHor[j] = grid[i][j];
        }

        if (grid[i][j] > maxVert[i]) {
          maxVert[i] = grid[i][j];
        }

      }
    }

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        int cur = grid[i][j];
        int limit = min(maxHor[j], maxVert[i]);
        grid[i][j] = limit;
        result += limit - cur;
      }
    }

    return result;
  }

  static int min(int a, int b) {
    return a > b ? b : a;
  }
}
