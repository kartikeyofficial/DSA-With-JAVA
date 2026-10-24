import java.util.Stack;

public class ReverseString {
    public String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();


    }

    static void main(String[] args) {
        ReverseString s = new ReverseString();
        String str = "ABC";
        System.out.println(s.reverse(str));


    }
}
