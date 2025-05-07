public class onetwofive {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.err.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length();

        while(start < end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
             if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
               return false;
            }
            start++;
            end--;
        }
     return true;
    }
}
