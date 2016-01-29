package org.campus02.LogisticManager;

import java.util.ArrayList;

public class LogisticManager {

	protected ArrayList<Moveable> movMobjects = new ArrayList<>();

	public LogisticManager(ArrayList<Moveable> movMobjects) {
		super();
		this.movMobjects = movMobjects;
	}
	
	public void addObj (Moveable obj)
	{
		movMobjects.add(obj);
	}
	
	public void moveAll(String destination)
	{
		for (Moveable moveable : movMobjects) {
			moveable.move(destination);
			
		}
	}

	

	
	
}
