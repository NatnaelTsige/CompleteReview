package PoinPac;
// This class is test class (client program)  for each version point class we make.

public class TestMain {

    public static void main(String[] args) {
        firstClass();
        bookExample();

        // utilizing the static translate method.
        PointFirst examp = new PointFirst(); // x and y are zero here.
        System.out.println("The x and y value of examp are : " + examp.x + " & " + examp.y + ".");
        System.out.println();

        translate(examp, 7, 8);
        System.out.println("After translation");
        System.out.println("The x and y value of examp are : " + examp.x + " & " + examp.y + ".");
        System.out.println();

        secondClass();

        thirdClass();

        fourthClass();

        fifthClass();

        finalClass();


    }

    // This method is a test method for the first version of class.
    // with just the fields.
    public static void firstClass() {
        // constructing a pointFirst object.
        // when object is constructed, its fields are given default initial values of
        PointFirst coord = new PointFirst();
        // initiating each fields with a different values than the default value zero;
        coord.x = 9;
        coord.y = 10;
        // trying to print. This won't work because our class does not a toString or print instance method yet.
        // the output of this will simply be the address.
        System.out.println(coord);
        System.out.println();
        // but we can call each filed individually to print the same way we assigned a value to the filed.
        System.out.println("coord is (" + coord.x + ", " + coord.y + ")");
        System.out.println();
    }

    public static void bookExample() {
        // constructing a pointFirst object.
        PointFirst p1 = new PointFirst();
        // initiating each fields with a different values than the default value zero;
        p1.x = 7;
        p1.y = 2;

        // constructing a pointFirst object.
        PointFirst p2 = new PointFirst();
        // initiating each fields with a different values than the default value zero;
        p2.x = 4;
        p2.y = 3;

        // print each point and its distance from origin
        // here we use the dot notation (objectName.filed to obtain each filed.
        System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
        // using the distance equation and java math method to get the distance from the origin.
        //also assigen it a variable.
        double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        // printing the distance.
        System.out.println("distance from origin = " + dist1);

        // doing the same thing for the second object.
        System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
        double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        System.out.println("distance from origin = " + dist2);
        System.out.println();

        // translate each point to a new location
        p1.x += 11;
        p1.y += 6;
        p2.x += 1;
        p2.y += 7;

        // print the points again
        System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
    }

    // static version of the translate method.
    public static void translate(PointFirst p, int dx, int dy) {
        p.x += dx;
        p.y += dy;
    }

    // This method is a test method for the second version of class.
    // with a translator.
    public static void secondClass() {
        PointSecond examp = new PointSecond();
        examp.x = 3;
        examp.y = 8;
        System.out.println("The x and y value of examp are : " + examp.x + " & " + examp.y + ".");
        System.out.println();
        examp.translate(17, 12);
        System.out.println("After translation");
        System.out.println("The x and y value of examp are : " + examp.x + " & " + examp.y + ".");
    }

    // This method is a test method for the third version of class.
    // with a distance accessor.
    public static void thirdClass() {
        PointThird examp = new PointThird();
        examp.x = 3;
        examp.y = 8;
        System.out.println();
        System.out.println("distance from origin = " + examp.distanceFromOrigin());

    }

    // This method is a test method for the fourth version of class.
    // with toString method.
    public static void fourthClass() {
        PonitFourth examp = new PonitFourth();
        examp.x = 17;
        examp.y = 12;
        System.out.println();
        System.out.println("examp is " + examp);

        //or
        System.out.println();
        System.out.println("examp is " + examp.toString());
    }

    public static void fifthClass() {
        PointFifth examp = new PointFifth();
        examp.x = 9;
        examp.y = 14;
        // with empty parameter and empty instance method and initialized.
        System.out.println();
        System.out.println("examp is " + examp);
        // with empty parameter and empty instance method and not initialized
        PointFifth examp2 = new PointFifth();
        System.out.println();
        System.out.println("examp is " + examp2);

        //using the constructor that passes parameter.
        PointFifth examp3 = new PointFifth(7,21);
        System.out.println();
        System.out.println("examp is " + examp3);
    }

    public static void finalClass(){
        Point examp = new Point(28, 26);
        //This will not work. because the fields are encapsulated in this version.
        //System.out.println("eamp is (" + examp.x + ", " + examp.y + ")");
        //This on the other hand will work.
        System.out.println();
        System.out.println("p1 is (" + examp.getX() + ", " + examp.getY() + ")");
        //This also will not work as the fields are private.
        //examp.x = 0;

    }

}