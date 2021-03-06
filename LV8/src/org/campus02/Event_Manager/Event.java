package org.campus02.Event_Manager;

public class Event {
private String Title;
private String Ort;
private Double Eintrittspreis;

public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getOrt() {
	return Ort;
}
public void setOrt(String ort) {
	Ort = ort;
}
public Double getEintrittspreis() {
	return Eintrittspreis;
}
public void setEintrittspreis(Double eintrittspreis) {
	Eintrittspreis = eintrittspreis;
}
public Event(String title, String ort, Double eintrittspreis) {
	super();
	Title = title;
	Ort = ort;
	Eintrittspreis = eintrittspreis;
}

@Override
public String toString() {
	return "Event [Title=" + Title + ", Ort=" + Ort + ", Eintrittspreis=" + Eintrittspreis + "]";
}
}
