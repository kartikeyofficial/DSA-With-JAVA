class SubString {
    public static String subString(String str, int si, int ei){
        String newStr = "";
        for (int i=si;i<ei;i++){
            newStr += str.charAt(i);
        }
        return newStr;
    }
    static void main(String[] args) {
        String str = "Hello PennyWise";
        System.out.println("Your Sub String is: "+subString(str,0,15));
        System.out.println(str.substring(0,5)); // inbuilt method of String
    }
}
