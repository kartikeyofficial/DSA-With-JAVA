public class elseIfDemo {
    static void main(String[] args) {
        int a=10;
        int b=20;
        int c=5;
        if(a>b && a>c){
            System.out.println(a+" is the Greater Number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the Greater Number");
        }
        else{
            System.out.println(c+" is the Greater Number");
        }
    }
}
