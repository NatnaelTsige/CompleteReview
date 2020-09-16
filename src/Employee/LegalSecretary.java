package Employee;
//Be careful not to confuse overriding with overloading.
//overloading occurs when one class contains multiple methods that have the same name but different parameter signatures.
//Overriding occurs when a subclass substitutes its own version of an otherwise inherited method that uses exactly the same
//name and the same parameters.

// A class to represent legal secretaries.
public class LegalSecretary extends Secretary {
    // overrides getSalary from Employee class
    public double getSalary() {
        return 45000.0;
    }

    // new behavior of LegalSecretary objects
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
