import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class threeBest {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.print(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        Queue<Character> Q = new LinkedList<>();

        int max = 0;
        int FinalMax = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                Q.add(s.charAt(i));
                max = Q.size();
            }
              
            
            else{
               while(!Q.isEmpty()){
                char current = Q.poll();
                set.remove(current);
                if(current == s.charAt(i)){
                    max = 0;
                    break;
                }
                set.add(s.charAt(i));
                Q.add(s.charAt(i));
               }

            }

            if(max > FinalMax){
                FinalMax = max;
            }

           
        }
        return FinalMax;
    }


}
