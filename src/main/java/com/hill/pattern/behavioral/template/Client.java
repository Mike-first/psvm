//Template method //defines the basis of the algorithm and allows heirs to redefine some steps of the algorithm without changing its structure as a whole //<p> //something doesn't come to mind, because it will be a combination of wake up, go to work, work, where everything is the same, except go //you can go by bus, bike, car.
//the point is that you can write a separate class for each of the three options, but this ensures the DRY principle, since wake up and work are the same in all options.

package com.hill.pattern.behavioral.template;

public class Client {
    public static void main(String[] args) {
        GoAtWorkTemplate bicycle = new Bicycle();
        GoAtWorkTemplate bus = new Bus();
        GoAtWorkTemplate auto = new Automobile();

        System.out.println("\nYesterday:");
        bicycle.active();
        System.out.println("\nToday:");
        bus.active();
        System.out.println("\nTomorrow");
        auto.active();
    }
}
