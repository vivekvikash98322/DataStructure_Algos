package array_strings.arraysProbems.SlidingWindow;

public class LongestSubArray {
    

    public static void main(String[] args) {
        
        int arr [] = {3, 1, 2, 7, 4, 2, 1, 1, 5};

        int k = 8;

        int sum = 0;
        int start = 0;
        int end = 0;
        int ans = 0;

        while(end < arr.length){

            sum += arr[end];//Increasng window size

            while(sum > k){

                sum -= arr[start];
                start++;
            }

            ans = Math.max(ans, end - start + 1);
            end++;

        }

        System.out.println(ans);
    }
}
