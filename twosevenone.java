import java.util.Arrays;

public class twosevenone {
    public static void main(String[] args) {
        String[] data = {"omkar", "is", "a", "police"};
       StringBuilder encode =  encode(data);
        System.out.println(Arrays.toString(decode(encode,data.length)));
       
    }

    private static String[] decode( StringBuilder encode,int k) {
       String[] ans = new String[k];
       int i = 0;
       String en = encode.toString();
       for(char c : en.toCharArray()){
       
        if(c != '*'){
            if(ans[i] == null){
                ans[i] = "";
            }
            ans[i] +=c;
        }

        if(c == '*'){
           i+=1;
        }
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
