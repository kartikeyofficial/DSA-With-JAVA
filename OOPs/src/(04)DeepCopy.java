 class DeepCopy {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kumar Kartikey";
        s1.rollNo = 73;
        s1.marks[0] = 90;
        s1.marks[1] = 85;
        s1.marks[2] = 93;

        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}
class Student{
    int marks[];
    String name;
    int rollNo;

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");

    }
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        marks = new int[3];
        for (int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(String name){
        this.name = name;
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
}
