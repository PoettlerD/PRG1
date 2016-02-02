package org.campus02.Event_Manager;

import java.util.ArrayList;
import java.util.HashMap;



public class EventKalender {
private ArrayList<Event> events;

public EventKalender(ArrayList<Event> events) {
	super();
	this.events = events;
}

public void addEvent (Event e)
{
	events.add(e);
}


public Event getByTitle (String title)
{
	for (Event event : events) {
		if (event.getTitle().equals(title))
		{
			return event;
		}
	}
return null;
}

public ArrayList<Event> getByOrt(String ort)
{
	ArrayList<Event> eventsOrt = new ArrayList<>();
	for (Event event : events) {
		if (event.getOrt().equals(ort))
		{
			eventsOrt.add(event);
		}
	}
return eventsOrt;
}

public ArrayList<Event> getByEintrittsPreis(double min, double max)
{
	ArrayList<Event> eventsPrice = new ArrayList<>();
	
	for (Event event : events) {
		if ((event.getEintrittspreis() >= min) && (event.getEintrittspreis() <= max))
		{
			eventsPrice.add(event);
		}

			}
	return eventsPrice;
}

public ArrayList<Event> getMostExpensiveByOrt(String ort)
{
	ArrayList<Event> eventsMostExpensiveByOrt = new ArrayList<>();
	for (Event event : events) {
		if (event.getOrt().equals(ort))
		{
			if (eventsMostExpensiveByOrt.size() != 0)
			{
			if (eventsMostExpensiveByOrt.get(0).getEintrittspreis() < event.getEintrittspreis())
			{
				eventsMostExpensiveByOrt.clear();
				eventsMostExpensiveByOrt.add(event);
			}
			}
			else
			{
				eventsMostExpensiveByOrt.add(event);
			}
		}
	}
return eventsMostExpensiveByOrt;
}

public double getAvgPriceByOrt (String ort)
{
	int counter = 0;
	double avgPriceByOrt = 0.0;
	for (Event event : events) {
		if (event.getOrt().equals(ort))
		{
			counter++;
			avgPriceByOrt += event.getEintrittspreis();
		}
		}
	avgPriceByOrt = (avgPriceByOrt/(double) counter);
return avgPriceByOrt;
}

public HashMap<String, Integer> getCountByOrt()
{
	HashMap<String, Integer> CountByOrt = new HashMap<>();
	for (Event event : events) {
		if (!CountByOrt.containsKey(event.getOrt()))
		{
			CountByOrt.put(event.getOrt(), 1);
		}
		else
		{
			CountByOrt.put(event.getOrt(),CountByOrt.get(event.getOrt())+1);
		}
	}
return CountByOrt;
}
}

