class Polymorphism {
    static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.sum(4,6));
        System.out.println(c1.sum(4.233f,3.44f));
        System.out.println(c1.sum(4,6,9));

    }
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return  a-b;
    }
    int sum(int a, int b, int c){
        return  a+b+c;
    }
}
