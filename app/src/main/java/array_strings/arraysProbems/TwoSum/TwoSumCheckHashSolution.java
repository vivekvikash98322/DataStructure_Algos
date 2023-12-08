package array_strings.arraysProbems.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumCheckHashSolution {
    
    public static void main(String[] args) {
        
        int array [] = {1, 2, 4, 6, 8, 9, 14, 15};
        int targetSum = 13;
        int ans [] = new int [2];

        Map<Integer, Integer> map = new HashMap<>(); 

       for (int i = 0; i < array.length; i++) {

            if(map.containsKey(targetSum - array[i])){
                ans[0] = i;
                ans[1] = map.get(targetSum - array[i]);
            }else {
                map.put(array[i], i);
            }
       }

    }
}
