package LinearSearch;

import java.util.Arrays;

// search in 2D arrays
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        int target = 17;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans)); // [3, 1]
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                    // return arr[row][col];
                }
            }
        }
        return new int[]{-1, -1};
    }
}
