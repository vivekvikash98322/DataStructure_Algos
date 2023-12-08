package array_strings.arraysProbems.TwoSum;

/**
 * Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
 */
public class TwoSumCheck {
    
    public static void main(String[] args) {
        
        int array [] = {1, 2, 4, 6, 8, 9, 14, 15};
        int targetSum = 13;

        int start = 0;
        int end = array.length - 1;

        while(start < end){
            
            int sum = array[start] + array[end];

            if(sum == targetSum){
                System.out.println(array[start] + " " + array[end]);
                break;
            }else if(sum > targetSum){
                end--;
            }else {
                start++;
            }

        }
    }
}
