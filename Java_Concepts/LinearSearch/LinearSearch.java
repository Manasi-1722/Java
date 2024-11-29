package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 55, 33, 12, 43, 66, 27, 22, 77};
        int target = 12;
        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target){
        // base condition
        if(arr.length == 0) {
            return -1;
        }
        // run loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // if the target value is not found return -1
        return -1;
    }


    // if element found return the element itself
    static int linearSearch2(int[] arr, int target){

        if(arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return -1;
    }


    // if element found return true else false
    static boolean linearSearch3(int[] arr, int target){

        if(arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }
}
