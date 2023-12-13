package array_strings.arraysProbems.PrefixSum;

public class ArraySumQueries {

    public static void main(String[] args) {
        int nums [] = {1, 6, 3, 2, 7, 2};
        int queries [][] = {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;


        int prefix [] = new int [nums.length];
        boolean ans [] = new boolean [queries.length];

        prefix[0] = nums[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }


        int index = 0;
        for (int query [] : queries) {
            int leftBound = query[0];
            int rightBound = query[1];

            int sum = prefix[rightBound] - prefix[leftBound] + nums[leftBound];

            if(sum > limit){
                ans[index] = false;
            }else {
                ans[index] = true;
            }

            index++;
        }

        for (boolean b : ans) {
            System.out.println(b);
        }

    }
}
