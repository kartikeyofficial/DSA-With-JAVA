public class ConditionalStatements {
    static void main(String[] args) {
        int age = 17;
        if (age > 18) {
            System.out.println("You are Adult");
        } else if (age>13 && age<18) {
            System.out.println("You are Teenager");

        } else {
            System.out.println("You are Not Adult");
        }
    }
}