package Employee;// 9.1 inheritance Basic
//Code Reuse
//The practice of writing program code once and using it in many contexts.
//Object-oriented programming provides us with a feature called inheritance that increases our ability to reuse code
// by allowing one class to be an extension of another.
// Inheritance also allows us to write programs with hierarchies of related object types.
//Is-a Relationship: A hierarchical connection between two categories in which one type is a specialized version of the other.
//Inheritance Hierarchy: A set of hierarchical relationships between classes of objects.
//Inheritance (Inherit): A programming technique that allows a derived class to extend the functionality of a base class,
// inheriting all of its state and behavior.
//The derived class, more commonly called the subclass, inherits all of
//the state and behavior of its parent class, commonly called the superclass.
//Superclass: The parent class in an inheritance relationship.
//Subclass: The child, or derived, class in an inheritance relationship.
//We say that the subclass extends the superclass because it not only receives the superclass’s state and behavior
// but can also add new state and behavior of its own.
// A Java class can have only one superclass; it is not possible to extend more than one class.
// This is called single inheritance. On the other hand, one class may be extended by many subclasses.
//To declare one class as the subclass of another, place the extends keyword followed by the superclass name at the end
// of the subclass header. The general syntax is the following:
/*
    public class <name> extends <superclass>{
        <statement>
    }
 */

/*
1. Employees work 40 hours per week.
2. All employees earn a salary of $40,000 per year, with the
   exception of marketers, who make $50,000 per year, and legal
   secretaries, who make $45,000 per year.
3. Employees have two weeks of paid vacation leave per year, with
   the exception of lawyers, who have three weeks of vacation
   leave.
4. Employees use a yellow form to apply for vacation leave, with the
   exception of lawyers, who use a special pink form.
5. Each type of employee has unique behavior: Lawyers know how
   to handle lawsuits, marketers know how to advertise, secretaries
   know how to take dictation, and legal secretaries know how to file
   legal briefs.
 */


// code for basic employee.
public class Employee {
    //first represent all common behaviours

    public int getHours(){
        return 40;
    }

    public double getSalary(){
        return 40000.0;
    }

    public int getVacationDays(){
        return 10;
    }

    public String getVacationForm(){
        return "Yellow";
    }
}
// we can carte to class in one file as lon as we don't make both public

/*class Employee.Secretary extends Employee.Employee {
    public void takeDictation(String text){
        System.out.println("Dictating text: " + text);
    }
}*/