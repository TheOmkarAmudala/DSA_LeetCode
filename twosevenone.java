import java.util.Arrays;

public class twosevenone {
    public static void main(String[] args) {
        String[] data = {"omkar", "is", "a", "police"};
       StringBuilder encode =  encode(data);
        System.out.println(Arrays.toString(decode(encode,data.length)));
       
    }

    private static String[] decode( StringBuilder encode,int k) {
        StringBuilder[] builders = new StringBuilder[k];
        for (int j = 0; j < k; j++) {
            builders[j] = new StringBuilder();
        }
    
        int i = 0;
        String en = encode.toString();
        for (char c : en.toCharArray()) {
            if (c != '*') {
                builders[i].append(c);
            } else {
                i++;
            }
        }
    
        String[] ans = new String[k];
        for (int j = 0; j < k; j++) {
            ans[j] = builders[j].toString();
        }
    
        return ans;
    }
    
    
    private static StringBuilder encode(String[] data) {
       StringBuilder encode = new StringBuilder();
       for(String S: data){
           encode.append(S);
           encode.append("*");
       }
       
       System.out.println(encode);
       return encode;
    }
}
