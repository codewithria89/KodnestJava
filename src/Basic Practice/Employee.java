 class Employee {
     int id;
     String name;

     void work() {
         System.out.println("Working");
     }

     public class Main {
         public static void main(String[] args) {
             Employee e1 = new Employee();
             e1.id = 12;
             e1.name = "Raja";
             System.out.println(e1.id);
             System.out.println(e1.name);
             e1.work();

             Employee e2 = new Employee();
             e2.id = 77;
             e2.name = "Rani";
             System.out.println(e2.id);
             System.out.println(e2.name);
             e2.work();
         }
     }
 }
