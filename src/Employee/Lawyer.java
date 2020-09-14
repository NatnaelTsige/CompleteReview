package Employee;
//Overriding Methods
//Override: To implement a new version of a method to replace code that would otherwise have been inherited from a superclass.
//

public class Lawyer extends Employee {
    // overrides getVacationDays from Employee.Employee class
    public int getVacationDays(){
        return 15;
    }

    // overrides getVacationForm from Employee.Employee class
    public String getVacationForm(){
        return "pink";
    }

    // this is the Employee.Lawyer's added behavior
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
