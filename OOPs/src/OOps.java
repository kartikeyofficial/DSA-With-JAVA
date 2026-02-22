public class OOps {
    static void main(String[] args) {
        pen p1 = new pen();
        p1.color("Blue");
        System.out.println(p1.color);
        p1.price(10);
        System.out.println(p1.price+" $");
        p1.tip(0.7f);
        System.out.println(p1.tip+" mm");
    }
}
class pen{
    String color;
    int price;
    float tip;
    void  color(String color){
        this.color = color;
    }
    void  price(int price){
        this.price = price;
    }
    void tip(float tip){
        this.tip= tip;
    }
}
class  student{
    int rollNo;
    String name;
    String address;
    void rollNo(int rollNo){
        this.rollNo = rollNo;
    }
    void name(String name){
        this.name = name;
    }
    void  address(String address){
        this.address = address;
    }
}
