public class FunctionOverloadingDataTypes {
    public static int Sum(int a, int b){
        return a+b;
    }
    public static float Sum(float a, float b){
        return a+b;
    }
    static void main(String[] args) {
        System.out.println("Sum Of Int Data Type: "+Sum(4,5));
        System.out.println("Sum of Float Data Type: "+Sum(4.0f,5.0f));

    }
}
