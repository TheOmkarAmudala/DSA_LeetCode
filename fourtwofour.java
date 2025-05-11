
import java.util.LinkedList;
import java.util.Queue;

public class fourtwofour {
    public static void main(String[] args) {
        String s = "AABAAB";
        int k = 2;
        System.out.print(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;

        Queue<Character> Q = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++){
            right++;
            if(s.charAt(right) != s.charAt(left)){
                if(k > 1){
                    right = left;
                    right++;
                    k--;
                }

            }
        }
        return 0;
    }
}
