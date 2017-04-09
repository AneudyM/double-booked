package com.aneudy;

/**
 * Created by aneudy on 08/04/17.
 */
public class Pair {
    private Event event_a;
    private Event event_b;

    public Pair(){

    }

    public Pair(Event a, Event b){
        event_a = a;
        event_b = b;
    }

    public Pair setPair(Event a, Event b){
        event_a = a;
        event_b = b;
        return new Pair(event_a, event_b);
    }

    public Event getLeft(){
        return event_a;
    }

    public Event getRight(){
        return event_b;
    }

    public Pair getPair(){

        return this;
    }

    /*
    public String toString(){
        return "Pair: " + event_a.getName() + " --> " + event_b.getName();
        //return event_a.getName() + " --> " + event_b.getName();
    }
    */
}
