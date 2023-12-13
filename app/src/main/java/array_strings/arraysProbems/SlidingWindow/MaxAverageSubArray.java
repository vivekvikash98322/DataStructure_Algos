package array_strings.arraysProbems.SlidingWindow;

public class MaxAverageSubArray {
    

    public static void main(String[] args) {
            
        int array [] = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(array, k));
        System.out.println(findMaxAverageSecond(array, k));
    }

    
    public static double findMaxAverage(int[] nums, int k) {
        
        int end = 0;
        int start = 0;
        int sum = 0;
        double avg = -Double.MAX_VALUE;

        while(end < nums.length){

            sum += nums[end];

            if((end - start + 1) == k){

                avg = Math.max(avg, (double)sum/k);
                sum -= nums[start];
                start++;
            }

            end++;
        }

        return avg;
    }

    public static double findMaxAverageSecond(int[] nums, int k) {
        
        int end = 0;
        int sum = 0;
        double avg = -Double.MAX_VALUE;


        for (end = 0; end < k; end++) {
            sum+= nums[end];
        }

        avg = (double)sum/k;
        for(end = k ; end < nums.length; end++){

            sum  +=  nums[end] - nums[end - k];
            avg = Math.max(avg, (double)sum/k);
        }

        return avg;
    }
}
