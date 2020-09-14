package PoinPac;
//The toString Method
//When a Java program is printing an object or concatenating it with a String,
//the program calls a special method called toString on the object to convert it into a String .
// The toString method is an instance method that returns a String representation of the object.
// A toString method accepts no parameters and has a String return type:
//If you don’t write a toString method in your class, your class will use a default version that returns
//the class name followed by an @ sign and some letters and numbers related to the object’s address in memory.
//The Java guidelines recommend writing a toString method in every class you write.

public class PonitFourth {
    int x;
    int y;

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
