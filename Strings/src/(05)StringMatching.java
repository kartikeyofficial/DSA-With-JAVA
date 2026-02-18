class StringMatching {
    static void main(String[] args) {
        String str1 = "Kartikey";
        String str2 = "Kartikey";
        String str3 = new String("Kartikey");
        if (str1==str2){
            System.out.println("String str1 and str2 are Equals");
        }
        else {
            System.out.println("Not Equals!");
        }
        if (str1==str3){
            System.out.println("String str1 and str3 are Equals");
        }
        else {
            System.out.println("Not Equals!");
        }
        if (str1.equals(str3)){
            System.out.println("String str1 and str3 are Equals");
        }
        else {
            System.out.println("Not Equals!");
        }

    }
}
