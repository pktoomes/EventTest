package com.company;

import java.lang.IllegalArgumentException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Event octoberTen = new Event();
        octoberTen.setAction("Face2Face");
        octoberTen.setName("OctoberMeeting");

        EventLog eventLog = new EventLog();
        try {
            eventLog.addEvent(octoberTen);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace(); }


    }

}

