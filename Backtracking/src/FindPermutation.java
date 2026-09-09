import java.util.Scanner;

public class FindPermutation {
    public static void findPer(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i)+str.substring(i+1);
            findPer(Newstr,ans+curr);
        }

    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = x.next();
        String ans = "";
        findPer(str,ans);
    }
}
