class RemoveDuplicates {
    public static void remove(String str, int i, StringBuilder newStr, boolean map[]){
        if (i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(i);
        if (map[currchar-'a'] == true){
            remove(str,i+1,newStr,map);
        }
        else {
            map[currchar-'a']  = true;
            remove(str, i+1,newStr.append(currchar),map);
        }
    }

    static void main(String[] args) {
        String str = "kkkaarrtttiikkkeeeyyy";
        remove(str,0,new StringBuilder(""),new boolean[26]);
    }
}
