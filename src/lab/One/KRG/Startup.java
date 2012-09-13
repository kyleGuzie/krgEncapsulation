package lab.One.KRG;

/**
 * Lab #1 In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by your
 * instructor.
 *
 *
 * @author Jim Lombardo, WCTC Instructor
 * @editied by Kyle Guzikowski
 * @version 1.02
 */
public class Startup {

    public static void main(String[] args) {



        Employee employee = new Employee("Peter", "Piper", "333-1234");

        employee.setCubeId("416");
        String cube = employee.getCubeId();


        //added method to call hr department steps for hiring
        employee.firstOrientation(cube);





        System.out.println("The employee's status is: " + employee.getStatus());


    }
}
