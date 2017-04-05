package com.aneudy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Event> eventsList = new ArrayList<Event>();

        Duration hour1 = Duration.ofHours(1);
        Duration hour2 = Duration.ofHours(2);
        Duration hour3 = Duration.ofHours(3);
        Duration hour4 = Duration.ofHours(4);
        Duration half = Duration.ofMinutes(30);
        LocalDateTime halfnow = LocalDateTime.now().plus(half);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now1 = LocalDateTime.now().plus(hour1);
        LocalDateTime now2 = LocalDateTime.now().plus(hour2);
        LocalDateTime now3 = LocalDateTime.now().plus(hour3);
        LocalDateTime now4 = LocalDateTime.now().plus(hour4);
        Event event1 = new Event("Event 1", now, now1);
        Event event2 = new Event("Event 2", halfnow, halfnow.plus(hour1));
        Event event3 = new Event("Event 3", now2, now2.plus(half));
        Event event4 = new Event("Event 4", now2.plus(half), now3);
        Event event5 = new Event("Event 5", now2.plus(half), now3.plus(half));
        Event event6 = new Event("Event 6", now1.plus(half), now2);
        eventsList.add(event6);
        eventsList.add(event4);
        eventsList.add(event2);
        eventsList.add(event5);
        eventsList.add(event3);
        eventsList.add(event1);

        ArrayList<Event> events = new ArrayList<Event>(eventsList);
        Collections.sort(events);
    }

    public ArrayList<Event> getOverlappingList(Event other){
        ArrayList<Event> overlappingEvents = new ArrayList<Event>();

        return overlappingEvents;
    }

    /*
    private static void displayEvents(ArrayList<Event> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getStart());
            System.out.println(list.get(i).getEnd());
        }
    }
    */


}
