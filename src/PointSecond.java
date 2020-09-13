// The second version of our Point class will contain both state and behavior.
// Behavior of objects is specified by writing instance methods.
// The instance methods of an object describe the messages to which that object can respond.
// Instance methode is a method inside an object that operates on that object.
// Instance methode have different calling methode the a static method.
// Example;
//        static method ----> nameOfTheMethod();
//        Instance methode ----> objectName.instanceMethodeName(xValue, yValue);

// In the test main when we tested for the PointFirst we used coord.x and coord.y
//  to manually adjust the fields.
// Since translating points is a common operation, we should represent it as a method.
// on choice is to write a static class in the TestMain but since we frequently use translation it's
// more convince to create an instance methode in the class.
// for the static version refer to the TestMain.
// the calling of a translate static methode would need there parameters passed through it.
// the object, the amount we need to shift x by and the amount we need to shift y by.
// Example translate(objectName, intOfShiftValeForx , intOfShiftValeForX);
// in comparison the instance method translate would only need the amount of values we are shifting
// each coordinate by.
// Example objectName.translate(xValue,  yValue);
//Whenever an instance method is called, it is called on a particular object.
// The scope os x and y here is the entire class unlike a primitive type which is declared in a method
//and its scope is just that method.

// a general syntax of an instance method.

    /*
     public <type> <name>(<type> <name>, ..., <type> <name>) {
        <statement>;
        <statement>;
        ...
        <statement>;
    }
    */
//Implicit Parameter: The object that is referenced during an instance method call.

public class PointSecond {
    int x;
    int y;

    public void translate(int dx, int dy) {
        // take the parameter value and it to x.
        x += dx;
        y += dy;
    }


}
