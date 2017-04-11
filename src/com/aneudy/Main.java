package com.aneudy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Event> eventsList = new ArrayList<>();

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
        Event event7 = new Event("Event 7", now3, now3.plus(hour1));
        Event event8 = new Event("Event 8", now1, now1.plus(hour3));
        Event event9 = new Event("Event 9", now2, now2.plus(hour1));
        eventsList.add(event6);
        eventsList.add(event4);
        eventsList.add(event9);
        eventsList.add(event2);
        eventsList.add(event5);
        eventsList.add(event8);
        eventsList.add(event3);
        eventsList.add(event1);
        eventsList.add(event7);

        //displayEvents(eventsList);
        //showOverlapping(eventsList);
        ArrayList<Pair> pairsList = showOverlapping(eventsList);
        // Print list of pairs containing overlapping event objects.
        System.out.println(pairsList);
    }

    private static void displayEvents(ArrayList<Event> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
        }
    }

    private static ArrayList<Pair> showOverlapping(ArrayList<Event> list) {
        int s = list.size();
        Collections.sort(list);
        Pair pairs = new Pair();
        ArrayList<Pair> pairsList = new ArrayList<>();
        ArrayList<Event> list2 = (ArrayList<Event>) list.clone();
        ArrayList<Event> finalList = new ArrayList<>();
        int n = 0;
        for (int j = 0; j < s; j++)
        {
            for (int k = s-1; k > 0; k--)
            {
                if((!list.get(j).equals(list2.get(k)))
                        && (list.get(j).getStart().isBefore(list2.get(k).getEnd()))
                        && (list2.get(k).getStart().isBefore(list.get(j).getEnd())))
                {
                    //Here the overlapping Events are chosen
                    // Combine the two events into one Pair object
                    //The following lines are for debugging purposes
                    pairsList.add(new Pair(list.get(j), list2.get(k)));
                    System.out.println(
                            "Pair: " + pairsList.get(n) + "\n" +
                                     "Events in Pair: " + "\n" +
                                     "    Left Event (a): " + pairsList.get(n).getLeft().getName() + " " +
                                     pairsList.get(n).getLeft() + "\n" +
                                     "    Right Event (b): " + pairsList.get(n).getRight().getName() + " " +
                                     pairsList.get(n).getRight()
                        );
                        System.out.println("/------------------------------------------------------------/");
                        n++;
                }
            }
        }
        return pairsList;
    }

    private ArrayList<Pair> cleanDuplicates(ArrayList<Pair> list){
        ArrayList<Pair> list2 = (ArrayList<Pair>) list.clone();


        ArrayList<Pair> cleanList = new ArrayList<Pair>();
        return cleanList;
    }


}
