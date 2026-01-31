public class FunctionOverloading {
    public static int Sum(int a, int b){
        return a+b;
    }
    public static int Sum(int a, int b, int c){
        return  a+b+c;
    }
    static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println("Sum of Two Numbers:"+Sum(a,b));
        System.out.println("Sum of Three Numbers:"+Sum(a,b,c));

    }
}
