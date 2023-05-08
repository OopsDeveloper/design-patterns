package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk = new FrontDesk();
    public void dinner(Integer guestId, LocalDateTime dateTime) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide dinner at " + dateTime + " and charge to " + roomNumber);
    }
}
