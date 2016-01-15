package org.campus02.blackjack;

import java.util.HashMap;

public class Blackjack {

	private HashMap<Player, Integer> players = new HashMap<>();
	
	
	public boolean add(Player player)
	{
		
		if (players.containsKey(player))
		{
			return false;
		}
		players.put(player, 0);
		return true;
	}
	
	public	boolean addCard(Player player, Integer cardValue)
	{
		if (players.containsKey(player) == true)
		{
			players.put(player, players.get(player)+cardValue);
			return true;
		}
	return false;
	}

	public	Integer getValue (Player player)
	{

			return players.get(player);

	}

	
	public String toString() {
		
		String result = "";
		for(Player p : players.keySet())
		{
			result += p.getName()+", Kartenwert: "+players.get(p)+"\n";
		}
	return result;
	
	}

}

