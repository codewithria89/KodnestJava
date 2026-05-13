package OOPS.Inheritence;

    class Developer {
        void work(){
            System.out.println("Developer working");
        }
        void project(){
            System.out.println("Developer doing Project");
        }
    }
class  JavaDeveloper extends Developer{
        @Override
        void work() {
            System.out.println("JavaDevelper is working");
        }
        @Override
    void project() {
            System.out.println("JavaDevelop is doing project");
        }
}
 class PythonDeveloper extends Developer{
    @Override
    void work(){
        System.out.println("PythonDeveloper working");
    }
    @Override
    void project(){
        System.out.println("PythonDeveloper doing Project");
    }
}
public class MMaain {
    public static void main(String[] args) {
      /*  Developer dev1 = new JavaDeveloper();
        dev1.work();
        dev1.project();
        Developer dev2 = new PythonDeveloper();
        dev2.work();
        dev2.project();*/

       /* Developer dev;
        dev = new JavaDeveloper();
        dev.work();
        dev.project();

        dev = new PythonDeveloper();
        dev.work();
        dev.project();*/

        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }
    static void accessMethod(Developer ref) {
        ref.work();
        ref.project();
    }
}
