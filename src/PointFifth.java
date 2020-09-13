//Object Initialization: Constructors
//Our fifth version of the Point class will include the ability to create Point objects at any initial location.
// The initial state of objects is specified by writing constructors.
// Recall that a constructor is a piece of code that initializes the state of new objects as they are created.
//A clumsy aspect of our existing client code is that it takes three lines to create and initialize the state of one Point object:
/*
// client needs 3 statements to initialize one Point object
Point p1 = new Point();
p1.x = 7;
p1.y = 2;
 */

//The constructor executes when the client uses the new keyword to create a new object.
// When you write a constructor, you specify what parameters must be passed when clients use the new keyword with your type
// and how those parameters should be used to initialize the newly created object.
// A constructor’s header begins with the keyword public , followed by the class’s name and any parameters.
//It looks like a method header with the same name as the class, except that you do not specify a return type.
// A constructor often has parameters that specify the object’s initial state.
// Our constructor for the Point class will accept initial x and y values as parameters and store them into the new Point object’s x and y fields:
// general Syntax for constructor;
/*
    public <class name>(<type> <name>, ..., <type> <name>) {
        <statement>;
        <statement>;
        ...
        <statement>;
    }
 */
//When a class doesn't have a constructor, as in our previous versions of the Point class, Java automatically supplies a default constructor with no parameters.
//That is why it was previously legal to construct a new Point().
// The default constructor auto-initializes all fields to zero equivalent values
// However, Java doesn’t supply the default empty constructor when we supply a constructor of our own,
// so it is illegal to construct Point objects without passing in the initial x and y parameters:
// unless we crate a constructor with no parameters.
//constructor doesn't have return type----- so no void.
//this: A Java keyword that allows you to refer to the implicit parameter inside a class.
//general syntax of this
// this.<filed name>
// One drawback of encapsulating the Point class is that it is no longer easy for the client code to set a Point to a new location.
// For convenience, we’ll add a new mutator to our encapsulated Point class that sets both the x and y fields of the object to new values passed as parameters:

public class PointFifth {
    int x;
    int y;

    // A constructor with no parmeter that would allow as to construct the object without passing parameters.
    // This method can be left empty or the fides set to zero.
    /*public PointFifth() {
        x = 0;
        y = 0;
    }*/

    // another variation
    /*public PointFifth() {

    }*/

    // constructs a new point with the given (x, y) location
    /*public PointFifth(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }*/

    // here we can implement (this) if we chose for the parameter variable to have the same name as the field.
    // same constructor as the above one with a parameter variable similar to the filed.
    public PointFifth(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Another variation the two contactors is to have one constructor go through the other.
    // this will also construct the object with (0, 0);
    public PointFifth() {
        this(0, 0);
    }

    // shifts this point’s location by the given amount
    public void translate(int dx, int dy) {
        // take the parameter value and it to x.
        x += dx;
        y += dy;
    }

    // returns the distance between this point and (0, 0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // returns a String representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
