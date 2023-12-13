package array_strings.arraysProbems.PrefixSum;

public class SplitArrayIntoTwo {
    

    public static void main(String[] args) {
        
        int array [] = {10,4,-8,7};

        System.out.println(waysToSplitArray(array));
    }



    public static int waysToSplitArray(int[] nums) {
        
        int prefix [] = new int [nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }

        System.out.print("[");
        for (int i : prefix) {
            System.out.print(i + " ");
        }
        System.out.print("]");

        int count = 0;
        for (int i = 0; i < prefix.length - 1; i++) {
            
            if(prefix[i] >= (prefix[prefix.length - 1] - prefix[i])){
                count++;
            }
        }

        System.out.println();
        return count;
    }
}
