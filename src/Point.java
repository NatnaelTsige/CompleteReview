//This is the final version of the point class.
// 8.4 Encapsulation
// Our next version of the point class will protect its data from unwanted access using a concept known as encapsulation.
// Encapsulation: Hiding the implementation details of an object from the clients of the object.
//This is an example of an important computer science concept known as abstraction.
// Abstraction Focusing on essential properties rather than inner details.
// In programming, the concept of hiding internal state from outside view is called encapsulation.
//Private Fields: To encapsulate the fields of an object, we declare them to be private
//by writing the keyword private at the start of the declaration of each field.
// general syntax of private
// private <type> <name>;
// fields can also be declared like the following.  private <type> <name> = <value>;
// once encapsulated the dot notation will not work.
/*this client code doesn’t work with encapsulated points
System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
would return;
PointMain.java:11: x has private access in Point
PointMain.java:11: y has private access in Point
*/
//To preserve the functionality of our client program,
// we need to provide a way for client code to access a Point object’s field values.
//We will do this by adding some new accessor methods to the Point class.
//If the value of an object’s field might be useful externally, it is common to write an accessor to return that value.
// One drawback of encapsulating the Point class is that it is no longer easy for the client code to set a Point to
// a new location.
// For convenience, we’ll add a new mutator to our encapsulated Point class that sets both the x and y fields of
// the object to new values passed as parameters:



public class Point {
    //Fields or stats
    private int x;
    private int y;

    // a constructor instance method (mutator) with no parameter
    // allows us to initiate the fields at the origin or (0,0)
    public Point(){
        this(0,0);
    }

    //a constructor instance method (mutator) with parameter
    // allows as to initiate the fields at any point one online.
    public Point(int x, int y) {
        setLocation(x, y);
    }

    // shifts this point’s location by the given amount
    //(mutator)
    /*public void translate(int dx, int dy) {
        // take the parameter value and it to x.
        x += dx;
        y += dy;
    }*/

    // returns the distance between this point and (0, 0)
    // accessor
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // returns the x-coordinate of this point
    public int getX() {
        return x;
    }

    // returns the y-coordinate of this point
    public int getY() {
        return y;
    }

    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //we can also modify the translate method like the now.
    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    // returns a String representation of this point
    // accessor
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
//proper syntax of class.
/*
public class <class name> {
    // fields
    private <type> <name>;
    private <type> <name>;
    ...

    // constructors
    public <class name>(<type> <name>, ..., <type> <name>) {
        <statement>;
        <statement>;
        ...
        <statement>;
    }
    ...
    // methods
    public <type> <name>(<type> <name>, ..., <type> <name>) {
    <statement>;
    <statement>;
    ...
    <statement>;
    }
    ...
}
 */