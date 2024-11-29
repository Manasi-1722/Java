package BinarySearch;

public class BinaryArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 27};
        int target = 15;
        int result = binarySearch(arr, target);
        System.out.println("Index of " + target + " is " + result);
    }

    // binary search 
    static int binarySearch(int[] arr, int target){
        int start = arr[0];
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){     //   2 3 4 5 6 7 
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
