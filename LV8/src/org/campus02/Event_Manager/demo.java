package org.campus02.Event_Manager;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Event event1 = new Event("Event1", "Graz", 50.3);
		Event event2 = new Event("Event2", "Graz", 25.0);
		Event event3 = new Event("Event3", "Graz", 75.8);
		Event event4 = new Event("Event4", "Wien", 99.9);
		Event event5 = new Event("Event5", "Wien", 150.0);
		Event event6 = new Event("Event6", "Wien", 35.8);
		Event event7 = new Event("Event7", "Wien", 45.99);
		Event event8 = new Event("Event8", "Monaco", 400.3);
		Event event9 = new Event("Event9", "Monaco", 3550.3);
		
		EventKalender eventkal = new EventKalender(new ArrayList<Event>());
		
		eventkal.addEvent(event1);
		eventkal.addEvent(event2);
		eventkal.addEvent(event3);
		eventkal.addEvent(event4);
		eventkal.addEvent(event5);
		eventkal.addEvent(event6);
		eventkal.addEvent(event7);
		eventkal.addEvent(event8);
		eventkal.addEvent(event9);
		
		System.out.println(eventkal.getAvgPriceByOrt("Graz"));
		System.out.println(eventkal.getAvgPriceByOrt("Wien"));
		System.out.println(eventkal.getAvgPriceByOrt("Monaco"));
		System.out.println("///////////////////////");
	

			System.out.println(eventkal.getByEintrittsPreis(50.0, 500.0));
			System.out.println(eventkal.getByOrt("Monaco"));
		
		System.out.println(eventkal.getByTitle("Event4"));
		System.out.println(eventkal.getCountByOrt());
		System.out.println(eventkal.getMostExpensiveByOrt("Wien"));
		
	}

}
