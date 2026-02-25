public class Constructor {
     String name;
     String rollNo;
     String gender;

    public Constructor() {
        System.out.println("this is a Default Constructor");
    }

    Constructor(String name, String rollNo, String gender){
        this.name = name;
        this.rollNo = rollNo;
        this.gender = gender;
    }
}
class newClass{
    static void main(String[] args) {
        Constructor c2 = new Constructor();
        Constructor c1 = new Constructor("Kumar Kartikey","2300900100073","Male");
        System.out.println(c1.name);

        // Copy Constructor

    }

}
