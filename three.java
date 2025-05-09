import java.util.HashSet;

public class three {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.print(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i)) ){
                 set.add(s.charAt(i));
            }
            else{
                set.remove(s.charAt(i-1));
                set.add(s.charAt(i));
                length = 0;
            }
            length++;
            if(length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
