 abstract class Abstract {

    String color;

    public Abstract() {
        this.color ="Brown";
    }



    abstract void Walk();
    static void main(String[] args) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.Walk();
        c.Walk();

    }
}
class Horse extends Abstract{


    void Walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Abstract{


    void Walk(){
        System.out.println("Walks on 3 legs");
    }


}
