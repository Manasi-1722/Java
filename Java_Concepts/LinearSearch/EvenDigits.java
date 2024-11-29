package LinearSearch;
// Leetcode problem - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


// Trick - (int)(Math.log10(number))   =   gives the number of digits of a number
// to convert negative number to positive ------> DO THIS! -----> num = num * -1
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {437,3157,3227,463,6869,2645,442};
        int cnt = 0;
        int ans = 0;
        
        // for(int i=0; i<nums.length; i++){
        //     while(nums[i] != 0){
        //         cnt++;
        //         nums[i] /= 10;   
        //     }
            
        //     if(cnt % 2 == 0){
        //         ans++;
        //     }   
        //     cnt = 0;      
        // }


        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                nums[i] = nums[i] * -1;
            }
            cnt = (int)(Math.log10(nums[i]) + 1);
            if(cnt % 2 == 0){
                ans++;
            }
            cnt = 0;
        }
        System.out.println("Answer = " + ans);
    }
}
