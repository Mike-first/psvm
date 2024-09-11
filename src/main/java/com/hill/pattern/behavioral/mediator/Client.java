
//Mediator
//ensures interaction between multiple objects, while forming weak coupling and eliminating the need for objects to explicitly refer to each other.
//an intermediary object is created for this. examples: chat users, colleagues and the department head (in the context of formalized information exchange),
//mail and people exchanging parcels.


package com.hill.pattern.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Foreman foreman = new Foreman();
        Bricklayer bricklayer = new Bricklayer(foreman);
        Carpenter carpenter = new Carpenter(foreman);
        foreman.setCarpenter(carpenter);
        foreman.setBricklayer(bricklayer);
        //carpenter will not receive his own message, only bricklayer
        carpenter.send("Hello, Bricklayer");
        bricklayer.send("Hey, Carpenter");

    }
}
