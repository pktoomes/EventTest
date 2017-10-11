package com.company;

import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList = new ArrayList<>();

    public boolean addEvent(Event event) throws IllegalArgumentException{
        if(((event.action.equals("Face2Face")) || ((event.action.equals("PhoneCall"))) || ((event.action.equals("TextMessaging"))) || ((event.action.equals("Unknown"))))){
            System.out.println("Event Name: " + event.name + ", Event Action: " + event.action);
            eventList.add(event);
            return true;
        }
        System.out.println("Accepted Actions: PhoneCall, TextMessaging, Face2Face, Unknown");
        throw new IllegalArgumentException();

    }

    public int getNumEvents(){
        int listSize = eventList.size();
        System.out.println(listSize);
        return listSize;
    }

    public EventLog(){
        this.eventList = eventList;
    }

    @Override
    public String toString() {
        return "EventLog{" +
                "eventList=" + eventList +
                '}';
    }
}




