package OOPS;

public class anonyms {
    public static void main(String[] args) {
         Student student = new Student();
         student.age = 15;
         student.name = "Rama";
        System.out.println(student.age);
        System.out.println(student.name);
        student.study();
        new Student().study();
    }
     static class Student {
        int age;
        String name;

        void study(){
            System.out.println("Studying");
        }
    }
}
