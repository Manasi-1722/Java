package LinearSearch;

public class MinMaxIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 71, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        int max = arr[0][0];
        int min = arr[0][0];
        

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                // max
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
                // min
                if(arr[row][col] < min){
                    min = arr[row][col];
                }

            }
        }
        System.out.println("Maximum element in the 2D-array is: " + max);
        System.out.println("Minimum element in the 2D-array is: " + min);
    }
}
