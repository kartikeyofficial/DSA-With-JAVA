import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Radius Of The Circle:");
        float r = x.nextFloat();
        float area = 3.14f *r*r;
        System.out.println("Area of Circle:"+area);


    }
}
