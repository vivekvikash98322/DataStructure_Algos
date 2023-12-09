package array_strings.arraysProbems.Subsequence;

public class IsSubSequesnce {
    
    public static void main(String[] args) {
        
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSub(s, t));
    }

    public static boolean isSub(String s, String t){

        int sPointer = 0;
        int tPointer = 0;

        while(sPointer < s.length() && tPointer < t.length()){

                if(s.charAt(sPointer) == t.charAt(tPointer)){
                    sPointer++;
                    tPointer++;
                }else {
                    tPointer++;
                }
        }

        if(sPointer == s.length() - 1){
            return true;
        }

        return false;
    }
}
