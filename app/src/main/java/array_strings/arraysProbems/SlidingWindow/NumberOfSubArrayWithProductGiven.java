package array_strings.arraysProbems.SlidingWindow;

public class NumberOfSubArrayWithProductGiven {
    

    /**
     * [10,5,2,6] k = 100
     * [10] [5][2][10, 5, 2] [5, 2], [5, 2, 6] 
     * @param args
     */
    public static void main(String[] args) {
        
        int array [] = {10,5,2,6};
        int k = 100;
        
        int start = 0;
        int end = 0;

        int prod = 1;
        int ans = 0 ;

        while(end < array.length){

            prod *= array[end];

            while(prod >= k){

                prod /= array[start];

                start++;
            }

            ans += end - start + 1;
            end++;
        }

        System.err.println(ans);
        
    }
}
