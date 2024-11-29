package LinearSearch;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {74, 88, 2, 4, 91, 87, 77, 17, 22};
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }

        // System.out.println(max);

        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);



    }
}
