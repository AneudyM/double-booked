package com.aneudy;

import java.time.LocalDateTime;

/**
 * Created by aneudy on 02/04/17.
 * Events
 */
public class Event implements Comparable<Event>{
    private String name;
    private LocalDateTime start;
    private LocalDateTime end;

    public Event() {}

    public Event(String newName, LocalDateTime newStart, LocalDateTime newEnd) {
        name = newName;
        start = newStart;
        end = newEnd;
    }

    public void setName(String eventName) {

        name = eventName;
    }

    public void setStart(LocalDateTime startTime) {

        start = startTime;
    }

    public void setEnd(LocalDateTime endTime) {

        end = endTime;
    }

    public String getName() {

        return name;
    }

    public LocalDateTime getStart() {

        return start;
    }

    public LocalDateTime getEnd(){

        return end;
    }

    public int compareTo(Event other){
        return start.compareTo(other.start);
    }
}
