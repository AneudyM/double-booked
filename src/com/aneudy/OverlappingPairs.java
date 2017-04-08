package com.aneudy;

/**
 * Created by aneudy on 07/04/17.
 * Pairs of overlapping events
 */
public class OverlappingPairs {
    private Event event_a;
    private Event event_b;

    public OverlappingPairs(Event a, Event b){
        event_a = a;
        event_b = b;
    }

    @Override
    public String toString() {
        return event_a.getName() + " " +
                event_a.getStart().toString() + " " +
                event_a.getEnd().toString() + " " + "\n" +
               event_b.getName() + " " +
                event_b.getStart().toString() + " " +
                event_b.getEnd().toString();
    }
}
