package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class EmployeeName {
    //@Column(name = "fName", nullable = false)
    private String firstName;
    //@Column(name = "mName", nullable = false)
    private String middleName;
    //@Column(name = "lName", nullable = false)
    private String lastName;

    public EmployeeName() {
    }

    public EmployeeName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name='" + firstName + '\'' +
                ", Middle Name='" + middleName + '\'' +
                ", Last Name='" + lastName + '\'' +
                '}';
    }
}
