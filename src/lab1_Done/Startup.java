package lab1_Done;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Kyle Guzikowski, WCTC Student
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        
        
        Employee employee = new Employee("Peter", "Piper", "333-1234");
        //employee.firstName = "Peter";
        //employee.lastName = "Piper";
        //employee.ssn = "333-1234";
        
        employee.FirstOrientation("B14");
        
        
        //employee.meetDepartmentStaff();
        //employee.meetWithHrForBenefitAndSalryInfo();
        //employee.reviewDeptPolicies();

        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
