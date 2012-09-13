package lab.One.KRG;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the four other best practices as explained by your
 * instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @editied by Kyle Guzikowski created
 *
 * @version 1.02
 */
public class Employee {

    public String getFirstName() {
        return firstName;
    }
    // KRG --- Added validation for user String Input

    private void setFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException();
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    // KRG --- Added validation for user String Input

    private void setLastName(String lastName) {

        if (lastName == null || lastName.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }
// KRG --- Added validation for user String Input

    private void setSsn(String ssn) {

        if (ssn == null || ssn.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    // KRG --- Added validation for user String Input

    public void setBirthDate(Date birthDate) {
        //insert validation code
        this.birthDate = birthDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        //insert validation
        this.cubeId = cubeId;
    }
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;//noval for booleans
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private final String ERR_MSG = "Hey You";

    public Employee(String fname, String lname, String ssn) {
        setFirstName(fname);
        setLastName(lname);
        setSsn(ssn);


    }

    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if (metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

    public void firstOrientation(String cubeId) {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
        getStatus();
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
