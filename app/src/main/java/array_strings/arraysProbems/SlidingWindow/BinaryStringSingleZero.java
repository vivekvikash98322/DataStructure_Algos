package array_strings.arraysProbems.SlidingWindow;

public class BinaryStringSingleZero {
    
    public static void main(String[] args) {
        
        String str = "1101100111";

        char c [] = str.toCharArray();

        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int ans = 0;


        while(end < c.length){

            if(c[end] == '0'){
                zeroCount++;
            }

            while(zeroCount > 1) {

                if(c[start] == '0'){
                    zeroCount--;
                }

                start++;
            }

            ans = Math.max(ans, end - start + 1);
            end++;
        }

        System.out.println(ans);
    }
}
