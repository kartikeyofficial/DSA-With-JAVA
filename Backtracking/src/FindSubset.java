import java.util.Scanner;

public class FindSubset {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String str = x.next();
        String ans="";
        findSubset(str,ans,0);

    }
    public static void findSubset(String str, String ans, int i){
        // Base Case
        if (i==str.length()){
            System.out.print(ans+", ");
            return;
        }


        //for yes
        findSubset(str,ans+str.charAt(i),i+1);

        //for No
        findSubset(str,ans,i+1);
    }
}
