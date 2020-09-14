package PoinPac;
//Mutators and Accessors
// the translate methode is an example of the mutators.
// Mutator: An instance method  that modifies the object's internal state(Filed).
//Generally a mutator assigns a new value to one of the object state.
// it's common convention for a mutator method's name to begin with set.
// Mutator method has a void return type in most cases and
// often accepts parameters that specify the new state of the object or the amount by which to modify the current state.
//Accessors form a second important category of instance methods.
//Accessor: An instance method that provides information about the state of an object without modifying it.
// Generally, an accessor returns the value of one of the object’s fields.
//Our client program computes the distance of two Points from the origin, (0, 0).
// Since this is a common operation related to the data in a Point , let’s give each Point object an accessor called
//distanceFromOrigin that computes and returns that Point object’s distance from the origin.
//A typical accessor will have no parameters and will not have a void return type,
// because it must return a piece of information.
// An accessor returns a value that is part of the state of the object or is derived from it.
// The names of many accessors begin with “get” or “is,” as in getBalance or isEmpty .

public class PointThird {
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
}
