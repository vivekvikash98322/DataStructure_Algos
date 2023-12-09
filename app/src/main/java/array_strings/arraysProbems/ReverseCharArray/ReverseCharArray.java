package array_strings.arraysProbems.ReverseCharArray;

public class ReverseCharArray {
    
    public static void main(String[] args) {
        
        char c [] = {'h','e','l','l','o'};

        int start = 0;
        int end = c.length - 1;

        while(start < end){

            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(c));
    }
}
