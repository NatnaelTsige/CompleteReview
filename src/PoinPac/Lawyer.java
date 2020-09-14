package PoinPac;
//Overriding Methods
//Override: To implement a new version of a method to replace code that would otherwise have been inherited from a superclass.
//

public class Lawyer extends Employee {
    // overrides getVacationDays from PoinPac.Employee class
    public int getVacationDays(){
        return 15;
    }

    // overrides getVacationForm from PoinPac.Employee class
    public String getVacationForm(){
        return "pink";
    }

    // this is the PoinPac.Lawyer's added behavior
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
