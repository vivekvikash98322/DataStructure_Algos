package array_strings;

public class febonaciseries {
    
    public static void main(String[] args) {
        
        System.out.println(febonaci(3));
    }

    public static int febonaci(int num){
        if(num <= 1) {
            return num;
        }

        int x = febonaci(num - 1);
        int y = febonaci(num - 2);

        return x + y;
    }
}
