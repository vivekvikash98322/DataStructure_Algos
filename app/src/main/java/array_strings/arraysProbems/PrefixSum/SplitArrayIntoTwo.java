package array_strings.arraysProbems.PrefixSum;

public class SplitArrayIntoTwo {
    

    public static void main(String[] args) {
        
        int array [] = {10,4,-8,7};

        System.out.println(waysToSplitArray(array));
        System.out.println(waysToSplitArraySec(array));
    }



    public static int waysToSplitArray(int[] nums) {
        
        int prefix [] = new int [nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }


        int count = 0;
        for (int i = 0; i < prefix.length - 1; i++) {
            
            if(prefix[i] >= (prefix[prefix.length - 1] - prefix[i])){
                count++;
            }
        }

        return count;
    }

    public static int waysToSplitArraySec(int[] nums) {
        
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int count = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            
            leftSum += nums[i];

            if(leftSum >= (sum - leftSum)){
                count++;
            }
        }

        return count;
    }
}
