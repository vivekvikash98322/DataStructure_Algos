package array_strings.arraysProbems.SortSqureArray;

public class SortSqureArrayProb {

    /**
     * -11, 0, 2, 3, 10
     * @param args
     */
    public static void main(String[] args) {
        
        int[] nums = {-4,-1,0,3,10};

        int ans [] = new int [nums.length];

        int index = ans.length - 1;
        
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int sq1 = nums[start] * nums[start];
            int sq2 = nums[end] * nums[end];

            if(sq1 > sq2){
                ans[index] = sq1;
                start++;
            }else{
                ans[index] = sq2;
                end--;
            }

            index--;
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
