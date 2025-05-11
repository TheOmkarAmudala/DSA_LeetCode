import java.util.HashSet;

public class fivesixseven {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        System.out.print(checkInclusion(s1,s2));

    }
    public static boolean checkInclusion(String s1, String s2) {
       HashSet<Character> set = new HashSet<>();
       int count = 0;
       for (char c : s1.toCharArray()) {
        set.add(c);
    }

       for(int i = 0; i < s2.length(); i++){
        if(set.contains(s2.charAt(i))){
            count++;
        }
        else{
          count = 0;
        }

        if(count == set.size()){
            return true;
        }
       }
       return false;
    }
}

