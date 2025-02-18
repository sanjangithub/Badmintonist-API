package com.sanjan.Badmintonistapi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BadmintonistService 
{
	@Autowired
	MaritialStatus maritialStatus;
	
	List<Badmintonist> playersList = new ArrayList<>(Arrays.asList(
			new Badmintonist(1, "sanjan","india","Singles", new MaritialStatus(true)),
			new Badmintonist(2,"kanya west","west indies","Singles", new MaritialStatus(true)),
			new Badmintonist(3,"gopichand","india","doubles", new MaritialStatus(true)),
			new Badmintonist(4,"sindhu","india","doubles", new MaritialStatus(false))
			
			
//			new Badmintonist(1, "sanjan","india","Singles"),
//			new Badmintonist(2,"kanya west","west indies","Singles"),
//			new Badmintonist(3,"gopichand","india","doubles"),
//			new Badmintonist(4,"sindhu","india","doubles")
			));
	
	List<Badmintonist> getAllPlayers()
	{
		return playersList;
	} 
	public Badmintonist getPlayersDetailsWithId(int id)
	{
		return playersList.stream().filter(i -> i.getId()==id).findFirst().get();
	}
	
	public String getPlayerIsSingleOrMarried(int id)
	{
		Badmintonist b = playersList.stream().filter(i -> i.getId()==id).findFirst().get();
		return b.getMaritialStatus().maritialMethod();
	}
	
	void addNewPlayer(Badmintonist badmintonist)
	{
		playersList.add(badmintonist);
	}

	public void updatePlayerDetailsWithId(int id, Badmintonist badmintonist) {
		playersList.set(playersList.indexOf(playersList.stream().filter(i -> i.getId()==id).findFirst().get()),badmintonist);
	}

	public void deletePlayerWithId(int id) {
		playersList.remove(playersList.indexOf(playersList.stream().filter(i -> i.getId()==id).findFirst().get()));
	}

	public List<Badmintonist> getPlayersWithCountry(String country) {
		
		try {
	        return playersList.stream()
	            .filter(i -> i.getCountry().equalsIgnoreCase(country))
	            .toList();
	    } catch (Exception e) {
	        System.err.println("An error occurred: " + e.getMessage());
	        e.printStackTrace();
	        return Collections.emptyList(); // or handle it more appropriately
	    }
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    Badmintonist getplayerById(int id)
//	{
//		return playersList.stream().filter(i -> i.getId()==id).findFirst().get();
//	}
// 
//	public void addNewPlayer(Badmintonist b)
//	{
//		playersList.add(b);
//	}
//	
//	public void updatePlayer(int id, Badmintonist b)
//	{
//		playersList.set(playersList.indexOf(playersList.stream().filter(i->i.getId()==id).findFirst().get()), b);
//	}
//}