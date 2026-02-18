import java.util.Scanner;

class PalindromeOrNot {
    public static boolean palindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i)==str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
    static void main(String[] args) {
        System.out.println("welcome to String is Palindrome Or Not: ");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str = x.nextLine();
        boolean ispalindrome= palindrome(str);
        if (ispalindrome){
            System.out.println("Given String is Palindrome!");
        }
        else {
            System.out.println("Given String is Not Palindrome!");
        }
    }
}
