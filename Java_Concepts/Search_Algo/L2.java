package Search_Algo;

public class L2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7,8};
        int target = 7;
        System.out.println(Search(arr, target, 2, 6));
        
    }

    static int Search(int[] arr, int target, int start, int end){
        // base condition
        if(arr.length == 0) {
            return -1;
        }
        // run loop
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }

        // if the target value is not found return -1
        return -1;
    }
}
