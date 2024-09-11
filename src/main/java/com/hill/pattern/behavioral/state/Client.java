//State
//Used if during program execution the behavior of an object should change depending on the state.
//if you imagine an object as a graph, where the vertices are the states that determine the behavior, and the edges are the transitions between states, then
//such a property can be implemented by conditional operators,
//but after a certain complexity threshold the code will become difficult to read and difficult to maintain

//output: move the states to separate classes and pass them to the context. person, whose behavior changes depending on the previous behavior
//another possible example is an ad on a well-known flea market (creation, publication, moderation, expiration)

//the pattern consists of a behavior interface, its implementations, a context (into which the behaviors will be loaded)

package com.hill.pattern.behavioral.state;

//MyDay
public class Client {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Human human = new Human();
        human.setActivity(activity);
        human.justDoIt();
        human.changeActivity();
        human.justDoIt();
        human.changeActivity();
        human.justDoIt();
        human.changeActivity();
        human.justDoIt();
        human.changeActivity();
        human.justDoIt();
    }
}
