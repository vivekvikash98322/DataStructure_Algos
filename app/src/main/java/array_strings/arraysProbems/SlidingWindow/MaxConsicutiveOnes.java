package array_strings.arraysProbems.SlidingWindow;

public class MaxConsicutiveOnes {
    
    public static void main(String[] args) {
        
        int array [] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(longestOnes(array, k));
    }

    public static int longestOnes(int[] nums, int k) {
        
        int end = 0;
        int start = 0;

        int zeroCount = 0;
        int ans = 0;


        while(end < nums.length){

            if(nums[end] == 0) zeroCount++;

            while(zeroCount > k){

                if(nums[start] == 0) zeroCount--;

                start++;
            }

            ans = Math.max(ans, end - start + 1);
            end++;
        }
     
        return ans;
    }
}

