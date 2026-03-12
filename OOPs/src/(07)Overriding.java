class Overriding {
    static void main(String[] args) {
       bike Bike = new bike();
        Bike.mustang();
    }
}
class car{
    void mustang(){
        System.out.println("Mustang gt!");
    }
}
class bike extends car{
    void mustang(){
        System.out.println("It is Red Mustang");
    }
}
