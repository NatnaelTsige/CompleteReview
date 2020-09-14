//Class invariants
//Class Invariant
//An assertion about an object’s state that is true for the lifetime of that object.

public class TimeSpan {
    private int hours;
    private int minutes;

    /*public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        this.hours += hours;
        this.minutes += minutes;

        // converts each 60 minutes into one hour
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }*/

    //the top two can be combined in the following way.
    // Constructs a time span with the given interval.
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        this.hours = 0;
        this.minutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        this.hours += hours;
        this.minutes += minutes;
        // converts each 60 minutes into one hour
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    // returns a String for this time span, such as "6h 15m"
    public String toString() {
        return hours + "h " + minutes + "m";
    }
}
