public class Operators {
    static void main(String[] args) {
        System.out.println("ARITHMATIC OPERATORS");
        int a = 10;
        int b= 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        int c = a++;
        System.out.println(a);
        System.out.println(c);

        System.out.println("\nRELATIONAL OPERATORS\n");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        System.out.println("\nLOGICAL OPERATOR\n");
        System.out.println((3>4)&&(5>2));
        System.out.println((3>4)||(5>2));
        System.out.println(!(5>3));

        System.out.println("\nASSIGNMENT OPERATORS\n");
        int A = 10;
        System.out.println(A+=20);
        System.out.println(A-=5);
        System.out.println(A*=4);
        System.out.println(A/=2);

    }
}
