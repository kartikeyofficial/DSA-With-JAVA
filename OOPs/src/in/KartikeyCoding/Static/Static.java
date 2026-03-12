package in.KartikeyCoding.Static;

public class Static {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "IEC College Of Engineering and Technology";

        s1.setName("Kumar Kartikey");
        s1.setRoll(73);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.getName());
        System.out.println(s2.getRoll());
    }
}
