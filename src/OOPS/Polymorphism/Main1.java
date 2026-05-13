package OOPS.Polymorphism;

class Developerr {
        void work(){
            System.out.println("Developer working");
        }
        void project(){
            System.out.println("Developer doing Project");
        }
    }
    class  JavaaDeveloper extends Developerr {
        @Override
        void work() {
            System.out.println("JavaDevelper is working");
        }
        @Override
        void project() {
            System.out.println("JavaDevelop is doing project");
        }
    }
    class PythonnDeveloper extends Developerr {
        @Override
        void work(){
            System.out.println("PythonDeveloper working");
        }
        @Override
        void project(){
            System.out.println("PythonDeveloper doing Project");
        }
    }
    public class Main1 {
        public static void main(String[] args) {

            JavaaDeveloper jd = new JavaaDeveloper();
            accessMethod(jd);
           PythonnDeveloper pd = new PythonnDeveloper();
            accessMethod(pd);
        }
        static void accessMethod(Developerr ref) {
            ref.work();
            ref.project();
        }
    }
