package array_strings.arraysProbems;

public class PalindromCheck {
    
    public static void main(String[] args) {
        
        String value = "racecar";

        int start = 0;
        int end = value.length() - 1;
        boolean isPalindrom = true;

        while (start < end) {
            
            if(value.charAt(start) != value.charAt(end)){
                isPalindrom = false;
                break;
            }

            start++;
            end--;
        }

        if(isPalindrom){
            System.out.println("Palindrom");
            return;
        }

        System.out.println("Not an palidnrom");
    }
}
